package com.repository;

import com.config.MongoDbFactory;
import com.config.PersistenceConfiguration;
import com.domain.Employee;
import com.mongodb.CommandResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Talha on 10/18/2016.
 */

public class DataLoader {

    private static final Logger logger =  LoggerFactory.getLogger(DataLoader.class);

    private final MongoTemplate mongoTemplate;

    DataLoader() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersistenceConfiguration.class);
        mongoTemplate = applicationContext.getBean(MongoTemplate.class);
    }

    public static void main(String... args) {
        DataLoader dataLoader = new DataLoader();
        dataLoader.loadData();
    }

    public void loadData() {
        loadMasterConfiguration();
    }

    private void loadMasterConfiguration() {
        MongoDbFactory.setDataBase("zoomTs");
        logger.info("Dropping default database: " + mongoTemplate.getDb().getName());
        CommandResult commandResult = mongoTemplate.executeCommand("{ dropDatabase: 1 }");
        logger.info("Dropping default database result " + commandResult.ok());
        logger.info("Populating default database: " + mongoTemplate.getDb().getName() + " with master configuration");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(UUID.randomUUID(), "Talha"));
        employees.add(new Employee(UUID.randomUUID(), "Talha1"));
        employees.add(new Employee(UUID.randomUUID(), "Talha2"));
        employees.forEach(mongoTemplate::insert);
        logger.info("Finished Populating default database: " + mongoTemplate.getDb().getName());
    }
}
