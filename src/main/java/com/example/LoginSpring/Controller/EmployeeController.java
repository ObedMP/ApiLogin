package com.example.LoginSpring.Controller;

import com.example.LoginSpring.Dto.EmployeeDto;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("login/employee")
public class EmployeeController {

    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDto employeeDto){
        String id = employeeService.addEmployee(saveEmployee());
        return id;
    }
}
