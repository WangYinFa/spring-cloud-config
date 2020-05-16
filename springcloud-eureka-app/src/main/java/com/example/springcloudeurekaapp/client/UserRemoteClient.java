package com.example.springcloudeurekaapp.client;

import com.example.springcloudeurekaapp.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client-user-service",configuration = FeignConfiguration.class)
public interface UserRemoteClient {
    @GetMapping(value = "/user/hello")
    String hello();
}
