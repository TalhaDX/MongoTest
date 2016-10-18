package com.service;
import com.domain.Employee;
import com.repository.EmployeeRepository;

import java.util.List;
import java.util.UUID;

/**
 * Created by Talha on 10/17/2016.
 */

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee findById(String employeeId) {

        return employeeRepository.findOne(UUID.fromString(employeeId));
    }

    @Override
    public List<Employee> findAll() {

        return null;
    }

    @Override
    public void update(Employee employee) {
        employeeRepository.save(employee);
    }
}