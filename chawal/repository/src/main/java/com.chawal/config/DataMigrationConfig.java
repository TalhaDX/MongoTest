package com.chawal.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;


/**
 * Created by Talha on 10/3/2016.
 */
@Configuration
@PropertySource("classpath:flyway.properties")
@Import(DataSourceConfiguration.class)

public class DataMigrationConfig {

    @Autowired
    private DataSource dataSource;

    @Value("${flyway.schema.table}")
    private String flywaySchemaTable;

    @Value("${flyway.migration.prefix}")
    private String flywayMigrationPrefix;

    @Value("${flyway.init.description}")
    private String flywayInitDescription;

    @Bean(initMethod = "migrate")
    @Profile("default")
    Flyway flyway(){
        Flyway flyway = flyway();
        flyway.setDataSource(dataSource);
        flyway.setTable(flywaySchemaTable);
        flyway.setSqlMigrationPrefix(flywayMigrationPrefix);
        flyway.repair();

        return flyway;
    }

}
