package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Example {

    @RequestMapping("/")
    public String home(){
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

    @Bean
    CommandLineRunner runner(){
        return args -> {
            System.out.println("CommandLineRunner running in the UnsplashApplication class...");
        };
    }
}
