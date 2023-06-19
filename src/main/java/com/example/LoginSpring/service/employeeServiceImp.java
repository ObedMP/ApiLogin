package com.example.LoginSpring.service;

import com.example.LoginSpring.Dto.EmployeeDto;
import com.example.LoginSpring.Dto.LoginDto;
import com.example.LoginSpring.entity.Employee;
import com.example.LoginSpring.payloadreponse.LoginMessage;
import com.example.LoginSpring.repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class employeeServiceImp implements employeeService{

    @Autowired
    private employeeRepository employeerepository;



    private PasswordEncoder passwordEncoder;

    @Override
    public LoginMessage loginEmployee(LoginDto loginDto) {
        String msg="";
        Employee emplo1=employeerepository.findByEmail(loginDto.getEmail());
        if(emplo1 != null){
            String pss=loginDto.getPass();
            String endcodepass=emplo1.getPass();
            Boolean isPwdRight=passwordEncoder.matches(pss,endcodepass);
            if(isPwdRight){
                Optional<Employee> employee = employeerepository.findOneByEmailAndPassword(loginDto.getEmail(),endcodepass);
                        if(employee.isPresent()){
                            return new LoginMessage("Login Succes",true);
                }else{
                            return new LoginMessage("Login Failed",false);
                }
            } else {

                return new LoginMessage("password Not Match", false);
            }
        }else {
            return new LoginMessage("Email not exits", false);
        }
            }


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
