package com.example.LoginSpring.service;

import com.example.LoginSpring.Dto.EmployeeDto;
import org.springframework.context.annotation.Bean;


public interface employeeService {

    String addEmployee(EmployeeDto employeeDto);
}
