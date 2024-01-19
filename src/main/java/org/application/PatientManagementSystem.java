package org.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PatientManagementSystem {

    public static void main(String[] args) {
        SpringApplication.run(org.application.PatientManagementSystem.class, args);
    }
}


