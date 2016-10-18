package com.sms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Abdus Salam on 9/24/2016.
 */
@Configuration
@Import({JPAConfiguration.class, DataMigrationConfig.class})
public class PersistenceConfiguration {
}
