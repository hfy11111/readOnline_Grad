package com.hfy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    //rest实体放入IOC容器中
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
