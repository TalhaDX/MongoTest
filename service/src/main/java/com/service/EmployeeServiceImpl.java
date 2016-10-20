package com.service;

import com.domain.Employee;
import com.repository.EmployeeRepository;

import java.util.ArrayList;
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
        //1-2-3-4-5
        return employeeRepository.findOne(UUID.fromString(employeeId));
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employeesFromDb = new ArrayList<>();
        employeeRepository.findAll().forEach(employeesFromDb::add);
        return employeesFromDb;
    }

    @Override
    public void update(Employee employee) {
        employeeRepository.save(employee);
    }
}