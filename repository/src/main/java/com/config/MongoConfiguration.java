package com.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.net.UnknownHostException;
import java.util.Collections;

/**
 * Created by Talha on 10/18/2016.
 */

@Configuration
@EnableMongoRepositories(basePackages = {"com.repositorydo"})
@PropertySource("classpath:mongo-local.properties")

public class MongoConfiguration {

    @Value("${dbhost}")
    private String dbHost;

    @Value("${dbport}")
    private int dbPort;

    @Value("${dbdefaultName}")
    private String defaultDatabaseName;

    @Value("${dbuser}")
    private String dbUser;

    @Value("${dbpassword}")
    private String dbPassword;

    @Value("${dbauthenticationdb}")
    private String authenticationDb;

    @Bean
    MongoClient mongoClient() throws UnknownHostException{
        return new MongoClient(serverAddress(), Collections.singletonList(mongoCredential()));
    }

    MongoCredential mongoCredential() throws UnknownHostException{
        return MongoCredential.createCredential(dbUser, authenticationDb, dbPassword.toCharArray());
    }

    @Bean
    ServerAddress serverAddress() throws  UnknownHostException{
        return new ServerAddress(dbHost, dbPort);
    }

    @Bean
    String defaultDatabaseName() {
        return defaultDatabaseName;
    }

}
