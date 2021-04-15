package com.springboot.zdy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.springboot.zdy.dao")

@SpringBootApplication
public class ZdyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZdyApplication.class, args);
    }

}
