package com.repository;

import com.domain.Employee;

/**
 * Created by Talha on 10/17/2016.
 */
public interface EmployeeRepository extends Repository<Employee> {

    Employee findByName(String name);
}
