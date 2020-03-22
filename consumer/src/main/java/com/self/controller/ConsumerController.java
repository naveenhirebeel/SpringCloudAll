package com.self.controller;

import com.self.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.self.client.EmployeeClient;

@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    EmployeeClient employeeClient;

    @GetMapping
    ResponseEntity<Employee> fetchEMployee(){

        System.out.println("Reached Consumer Controller.");
        System.out.println(employeeClient.getEmployees());

        return ResponseEntity.ok(employeeClient.getEmployees());
    }
}
