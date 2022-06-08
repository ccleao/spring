package com.testspring.testspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("")
@RequestMapping("/api")
public class TestspringApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestspringApplication.class, args);
        System.out.println("Teste!!!!");
    }

    @GetMapping("/{id}")
    public String testeApi(@PathVariable int id) {
        return "Teste!!!! " + id;
    }
}
