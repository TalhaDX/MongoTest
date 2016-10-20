package com.handler;

import com.domain.Employee;
import com.model.EmployeeModel;
import com.service.EmployeeService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Talha on 10/19/2016.
 */

public class EmployeeHandler {



    private EmployeeService employeeService;

    public EmployeeHandler(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    public List<EmployeeModel> findAllEmployees() {

        List<EmployeeModel> employeeModels = employeeService.findAll().stream().map(EmployeeModel::new).collect(Collectors.toList());

        // Alternative
//        for (Employee employee : employeeService.findAll()) {
//
//            employeeModels.add(new EmployeeModel(employee));
//        }

        return  employeeModels;
    }
}
