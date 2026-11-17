package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class OrganizationController {

    @GetMapping("/organization")
    public Map<String, Object> getOrganizationDetails() {
        Map<String, Object> organization = new HashMap<>();
        organization.put("id", 101);
        organization.put("organizationName", "TechCorp Global");
        organization.put("organizationCode", "TC-GL-01");
        organization.put("address", "Tech City, Bengaluru, India");
        organization.put("contactEmail", "info@techcorp.com");
        return organization;
    }
}

