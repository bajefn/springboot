package com.bjfn.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bjfn.springboot.mapper")
public class MywebdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MywebdemoApplication.class, args);
    }

}
