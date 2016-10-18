package com.repositorydo;

import com.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

/**
 * Created by Talha on 10/17/2016.
 */
public interface EmployeeDORepository extends MongoRepository<Employee, UUID> {

    Employee findByName(String employeeName);
}
