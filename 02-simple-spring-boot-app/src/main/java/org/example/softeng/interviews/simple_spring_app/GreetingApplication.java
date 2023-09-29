package org.example.softeng.interviews.simple_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The Greeting service application.
 */
@SpringBootApplication
public class GreetingApplication {

    public static void main(final String[] args) {
        SpringApplication.run(GreetingApplication.class, args);
    }
}