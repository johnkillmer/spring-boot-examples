package com.example;

import com.example.config.SampleConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Example {

    @Autowired
    SampleConfiguration myBean;

    @RequestMapping("/")
    public String home(){
        return "Hello World " + myBean.getName() + " \nserver1[" + myBean.getServers().get(0) + "] \nserver2[" + myBean.getServers().get(1) + "]";
    }

    public static void main(String[] args) {
        new SpringApplication().setAddCommandLineProperties(false);
        SpringApplication.run(Example.class, args);
    }

    @Bean
    CommandLineRunner runner(){
        return args -> {
            System.out.println("CommandLineRunner running in the UnsplashApplication class...");
        };
    }
}
