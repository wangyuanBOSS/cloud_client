package com.inspur.client.service;

import com.inspur.client.mapper.EmployeeMapper;
import com.inspur.client.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public Employee getEmpById(Integer id) {

        return employeeMapper.getEmpById(id);
    }
}
