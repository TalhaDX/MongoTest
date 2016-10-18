package hello;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Talha on 10/17/2016.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
