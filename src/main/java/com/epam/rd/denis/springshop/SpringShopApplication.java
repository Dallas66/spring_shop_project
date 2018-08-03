package com.epam.rd.denis.springshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringShopApplication.class, args);


    }
}
