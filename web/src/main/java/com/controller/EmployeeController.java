package com.controller;

import com.handler.EmployeeHandler;
import com.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Talha on 10/19/2016.
 */

@Controller
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeHandler employeeHandler;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ResponseBody
    public List<EmployeeModel> getAllEmployees() {
        return employeeHandler.findAllEmployees();
    }

}