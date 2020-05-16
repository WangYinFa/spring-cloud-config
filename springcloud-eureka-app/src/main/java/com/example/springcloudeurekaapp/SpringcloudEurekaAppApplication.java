package com.example.springcloudeurekaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//服务提供者
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.example.springcloudeurekaapp.client")
public class SpringcloudEurekaAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaAppApplication.class, args);
    }

}
