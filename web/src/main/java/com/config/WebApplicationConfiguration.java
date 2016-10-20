package com.config;

import com.handler.EmployeeHandler;
import com.service.EmployeeService;
import config.ServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Talha on 10/18/2016.
 */

@EnableWebMvc
@Configuration
@Import(ServiceConfiguration.class)
public class WebApplicationConfiguration {

    @Bean
    @Autowired
    public EmployeeHandler employeeHandler(EmployeeService employeeService){
        return new EmployeeHandler(employeeService);
    }

}