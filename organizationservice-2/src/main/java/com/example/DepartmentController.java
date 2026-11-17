package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class DepartmentController {

    @GetMapping("/department")
    public Map<String, Object> getDepartmentDetails() {
        Map<String, Object> department = new HashMap<>();
        department.put("id", 201);
        department.put("departmentName", "Information Technology");
        department.put("departmentCode", "IT-ENG");
        department.put("organizationCode", "TC-GL-01");
        department.put("headOfDepartment", "Sarah Connor");
        return department;
    }
}

