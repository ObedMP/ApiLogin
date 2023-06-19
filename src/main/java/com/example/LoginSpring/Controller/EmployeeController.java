package com.example.LoginSpring.Controller;

import com.example.LoginSpring.Dto.EmployeeDto;
import com.example.LoginSpring.Dto.LoginDto;
import com.example.LoginSpring.payloadreponse.LoginMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.LoginSpring.service.*;


@RestController
@RequestMapping("login/employee")
public class EmployeeController {

    @Autowired
    private employeeService employeeservice;

    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDto employeeDto){
        String id = employeeservice.addEmployee(employeeDto);
        return id;
    }

    @PostMapping(path ="/login" )
    public ResponseEntity<?>loginEmployee(@RequestBody LoginDto loginDto){
        LoginMessage loginMessage = employeeService.loginEmployee(loginDto);
        return ResponseEntity.ok(loginMessage);
    }
}
