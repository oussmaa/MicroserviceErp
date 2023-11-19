package com.example.erpserice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ErpSerice1Application {

    public static void main(String[] args) {
        SpringApplication.run(ErpSerice1Application.class, args);
    }

}
