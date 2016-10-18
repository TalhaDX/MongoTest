package config;

import com.config.PersistenceConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Talha on 10/18/2016.
 */

@Configuration
@Import( {PersistenceConfiguration.class})
public class ServiceConfiguration {

}
