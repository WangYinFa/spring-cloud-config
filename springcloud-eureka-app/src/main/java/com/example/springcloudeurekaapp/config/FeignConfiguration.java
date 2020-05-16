package com.example.springcloudeurekaapp.config;


import com.example.springcloudeurekaapp.Interceptor.FeignBasicAuthRequestInterceptor;
import feign.Contract;
import feign.Feign;
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

//    @Bean
//    public Contract feignContract(){
//        return new
//    }

    @Bean
    public FeignBasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new FeignBasicAuthRequestInterceptor();
    }

}

