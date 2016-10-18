package com.sms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Noor's on 9/24/2016.
 */
@Configuration
@Import({PersistenceConfiguration.class})
public class ServiceConfiguration {
}
