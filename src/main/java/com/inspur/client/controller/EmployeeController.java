package com.inspur.client.controller;

import com.inspur.client.pojo.Employee;
import com.inspur.client.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/dept/{id}")
    public Employee getEmployee(@PathVariable("id")Integer id){

        return employeeService.getEmpById(id);
    }

}
