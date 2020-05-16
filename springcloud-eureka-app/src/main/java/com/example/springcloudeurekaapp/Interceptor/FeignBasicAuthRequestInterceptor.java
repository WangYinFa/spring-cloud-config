package com.example.springcloudeurekaapp.Interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class FeignBasicAuthRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        System.out.println("进入业务逻辑");
    }
}
