package com.chawal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * Created by Talha on 10/3/2016.
 */
@Configuration
@Import({ServiceConfiguration.class})
public class WebApplicationConfig {
}
