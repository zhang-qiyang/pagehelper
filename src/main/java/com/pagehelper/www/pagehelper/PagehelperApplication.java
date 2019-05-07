package com.pagehelper.www.pagehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pagehelper.www.pagehelper.dao")
public class PagehelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(PagehelperApplication.class, args);
    }

}
