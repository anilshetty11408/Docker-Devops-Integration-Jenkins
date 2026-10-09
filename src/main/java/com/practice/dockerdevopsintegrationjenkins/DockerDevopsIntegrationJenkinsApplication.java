package com.practice.dockerdevopsintegrationjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDevopsIntegrationJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerDevopsIntegrationJenkinsApplication.class, args);
    }

    @GetMapping
    public String message(){
        return "DevOps learning!!";
    }
}
