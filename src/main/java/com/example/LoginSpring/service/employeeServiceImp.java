package com.example.LoginSpring.service;

import com.example.LoginSpring.Dto.EmployeeDto;
import com.example.LoginSpring.entity.Employee;
import com.example.LoginSpring.repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class employeeServiceImp implements employeeService{

    @Autowired
    private employeeRepository empployeeRepository;
    @Override
    public String addEmployee(EmployeeDto employeeDto) {
        Employee employee=new Employee();
        employeeDto.getEmployeeId(),
        employeeDto.getEmployeename(),
        employeeDto.getEmail(),
        this
    }
}
