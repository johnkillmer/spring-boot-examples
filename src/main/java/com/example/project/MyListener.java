package com.example.project;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyListener implements ApplicationListener {

    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("My custom event listener" + event.toString());
    }
}
