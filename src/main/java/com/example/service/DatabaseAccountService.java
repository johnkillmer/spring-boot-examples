package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseAccountService {

    private RiskAssessor riskAssessor;

//    @Autowired
    public DatabaseAccountService(RiskAssessor riskAssessor) {
        System.out.println("Invoked by spring");
        this.riskAssessor = riskAssessor;
    }
}
