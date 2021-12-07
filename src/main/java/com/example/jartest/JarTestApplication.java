package com.example.jartest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JarTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JarTestApplication.class, args);
    }

}
