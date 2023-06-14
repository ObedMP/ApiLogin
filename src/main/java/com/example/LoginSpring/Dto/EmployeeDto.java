package com.example.LoginSpring.Dto;



public class EmployeeDto {

    private int employeeId;
    private String employeename;
    private String email;
    private String pass;

    public EmployeeDto(int employeeId, String employeename, String email, String pass) {
        this.employeeId = employeeId;
        this.employeename = employeename;
        this.email = email;
        this.pass = pass;
    }

    public EmployeeDto() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "employeeId=" + employeeId +
                ", employeename='" + employeename + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
