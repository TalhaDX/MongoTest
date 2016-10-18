package config;

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

}
