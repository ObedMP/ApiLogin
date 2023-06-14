package com.example.LoginSpring.Controller;

import com.example.LoginSpring.Dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("login/employee")
public class EmployeeController {

    @Autowired
    private employeeService employeeService;
    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDto employeeDto){
        String id = employeeService.addEmployee(saveEmployee());
        return id;
    }
}
