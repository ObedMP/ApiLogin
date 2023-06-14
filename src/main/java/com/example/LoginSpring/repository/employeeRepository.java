package com.example.LoginSpring.repository;

import com.example.LoginSpring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface employeeRepository extends JpaRepository<Employee,Integer> {

}
