package com.repository;

import com.domain.Employee;
import com.repositorydo.EmployeeDORepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

/**
 * Created by Talha on 10/17/2016.
 */
public class EmployeeRepositoryImpl extends GenericRepository<Employee> implements EmployeeRepository {

    private EmployeeDORepository employeeDORepository;

    public EmployeeRepositoryImpl(EmployeeDORepository repository) {
        super(repository);
        employeeDORepository = repository;
    }

    public Employee findByName(String employeeName) {
        return employeeDORepository.findByName(employeeName);
    }


}