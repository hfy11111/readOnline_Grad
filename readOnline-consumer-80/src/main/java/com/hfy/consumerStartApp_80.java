package com.hfy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hfy.mapper")
public class consumerStartApp_80 {
    public static void main(String[] args) {
        SpringApplication.run(consumerStartApp_80.class,args);
    }
}
