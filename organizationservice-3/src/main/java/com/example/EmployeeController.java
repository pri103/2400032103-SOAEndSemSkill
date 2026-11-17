package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class EmployeeController {

    @GetMapping("/employee")
    public Map<String, Object> getEmployeeDetails() {
        Map<String, Object> employee = new HashMap<>();
        employee.put("id", 301);
        employee.put("employeeName", "John Doe");
        employee.put("email", "john.doe@techcorp.com");
        employee.put("departmentCode", "IT-ENG");
        employee.put("role", "Software Engineer");
        employee.put("salary", 75000);
        return employee;
    }
}

