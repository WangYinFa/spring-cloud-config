package com.example.springcloudeurekaapp.controller;

import com.example.springcloudeurekaapp.client.UserRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Value("${server.port}")
    private String port;

    @Autowired
    private UserRemoteClient userRemoteClient;

    @GetMapping(value = "/user/hello")
    public String hello() {
        return "欢迎进入" + port + "端口的hello";
    }


    @GetMapping("/callHello")
    public String callHello() {
        String result = userRemoteClient.hello();
        System.out.println(result);
        return result;
    }
}
