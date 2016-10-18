package com.chawal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * Created by Talha on 10/1/2016.
 */
@Configuration
@Import({JPAConfiguration.class, DataMigrationConfig.class})
public class PersistenceConfiguration {

}
