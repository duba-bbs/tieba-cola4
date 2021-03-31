package com.tingyu.tieba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.tingyu.tieba","com.alibaba.cola"})
@MapperScan("com.tingyu.tieba.mappers")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
