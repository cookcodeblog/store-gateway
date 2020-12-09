package com.example.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class StoreGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreGatewayApplication.class, args);
    }

}
