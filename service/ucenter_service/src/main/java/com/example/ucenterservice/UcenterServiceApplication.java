package com.example.ucenterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.example"})
public class UcenterServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UcenterServiceApplication.class, args);
    }

    @GetMapping("/")
    public String ucenter(){
        return "Hello Ucenter";
    }
}
