package com.example.memodevelop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MemodevelopApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemodevelopApplication.class, args);
    }

}
