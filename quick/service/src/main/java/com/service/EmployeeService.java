package com.service;

import com.domain.Employee;
import java.util.List;
/**
 * Created by Talha on 10/17/2016.
 */
public interface EmployeeService {

    Employee findById(String employeeId);
    List<Employee> findAll();
    void update(Employee employee);
}