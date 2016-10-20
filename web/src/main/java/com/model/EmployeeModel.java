package com.model;

import com.domain.Employee;

import java.util.UUID;

/**
 * Created by Talha on 10/20/2016.
 */
public class EmployeeModel {

    private UUID id;
    private String name;

    public EmployeeModel(){}

    public EmployeeModel(Employee employee){
        this.id = employee.getId();
        this.name = employee.getName();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
