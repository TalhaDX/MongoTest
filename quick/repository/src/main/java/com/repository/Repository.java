package com.repository;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
/**
 * Created by Talha on 10/17/2016.
 */

public interface Repository<T> extends CrudRepository<T, UUID>{

}
