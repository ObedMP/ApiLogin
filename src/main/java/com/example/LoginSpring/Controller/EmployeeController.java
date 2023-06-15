package com.example.LoginSpring.Controller;

import com.example.LoginSpring.Dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.LoginSpring.service.*;

@RestController
@CrossOrigin
@RequestMapping("login/employee")
public class EmployeeController {

    @Autowired
    private employeeService employeeservice;
    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDto employeeDto){
        String id = employeeservice.addEmployee(employeeDto);
        return id;
    }
}
