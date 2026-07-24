package org.test.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdCOntroller {

    @GetMapping("/message")
    public String getMessage() {
        return "Hello from the CI/CD pipeline!";
    }
}
