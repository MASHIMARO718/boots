package com.example.boots;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.boots.mapper")
public class BootsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootsApplication.class, args);
    }

}
