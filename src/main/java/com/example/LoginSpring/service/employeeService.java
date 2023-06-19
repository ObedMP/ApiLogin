package com.example.LoginSpring.service;

import com.example.LoginSpring.Dto.EmployeeDto;
import com.example.LoginSpring.Dto.LoginDto;
import com.example.LoginSpring.payloadreponse.LoginMessage;
import org.springframework.context.annotation.Bean;


public interface employeeService {

     static LoginMessage loginEmployee(LoginDto loginDto) ;


    String addEmployee(EmployeeDto employeeDto);
}
