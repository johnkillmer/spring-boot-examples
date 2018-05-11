package com.example.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    public RiskAssessor riskAssessor(){
        return new RiskAssessor();
    }
}
