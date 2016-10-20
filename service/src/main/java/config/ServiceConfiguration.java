package config;

import com.config.PersistenceConfiguration;
import com.repository.EmployeeRepository;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Talha on 10/18/2016.
 */

@Configuration
@Import( {PersistenceConfiguration.class})
public class ServiceConfiguration {

    @Bean
    @Autowired
    public EmployeeService employeeService(EmployeeRepository employeeRepository){
        return new EmployeeServiceImpl(employeeRepository);
    }
}