package com.example.invoicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.example.invoicedemo.repositories"})
@ComponentScan(basePackages = {"com.example.invoicedemo.controllers"})
public class InvoicedemoApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(InvoicedemoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(InvoicedemoApplication.class, args);
    }

}

