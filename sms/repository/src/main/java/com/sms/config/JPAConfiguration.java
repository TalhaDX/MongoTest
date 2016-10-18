package com.sms.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * Created by Abdus Salam on 8/1/2015.
 */

@Configuration
//@EnableJpaRepositories(basePackages = {""})
@PropertySource("classpath:jpa.properties")
@EnableTransactionManagement
@Import(DataSourceConfiguration.class)

class JPAConfiguration {

    @Value("${platform}")
    private String databasePlatform;

    @Value("${showsql}")
    private boolean showSQL = true;

    @Autowired
    private DataSource dataSource;

    @Bean
    @DependsOn("flyway")
    @Profile("default")
    EntityManagerFactory entityManagerFactory() {

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setDatabasePlatform(databasePlatform);
        vendorAdapter.setDatabase(Database.MYSQL);
        vendorAdapter.setShowSql(showSQL);

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setDataSource(dataSource);
        factory.afterPropertiesSet();

        return factory.getObject();
    }

    @Bean
    @Profile("default")
    PlatformTransactionManager transactionManager() {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory());
        txManager.setJpaDialect(new HibernateJpaDialect());
        return txManager;
    }
}
