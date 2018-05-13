package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix="my")
public class SampleConfiguration {

    @Value("${name}")
    private String name;

    public List<String> servers = new ArrayList<String>();

    public List<String> getServers() {
        return this.servers;
    }

    public String getName() {
        return name;
    }
}
