package com.example.LoginSpring.Dto;

public class LoginDto {

    private String email;
    private String pass;

    public LoginDto(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    public LoginDto() {
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
        return "LoginDto{" +
                "email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
