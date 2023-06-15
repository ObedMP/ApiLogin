package com.example.LoginSpring.service;

import com.example.LoginSpring.Dto.EmployeeDto;
import com.example.LoginSpring.entity.Employee;
import com.example.LoginSpring.repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class employeeServiceImp implements employeeService{

    @Autowired
    private employeeRepository employeerepository;



    private PasswordEncoder passwordEncoder;

    @Override
    public String addEmployee(EmployeeDto employeeDto) {
        Employee employee=new Employee(
        employeeDto.getEmployeeId(),
        employeeDto.getEmployeename(),
        employeeDto.getEmail(),
        this.passwordEncoder.encode(employeeDto.getPass())
        );

        employeerepository.save(employee);
        return employee.getEmployeename();
    }
}
