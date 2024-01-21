package com.atguigu.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.admin.mapper")
@ServletComponentScan(basePackages = "com.atguigu.admin")

public class SpringbootWebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebAdminApplication.class, args);
    }

}
