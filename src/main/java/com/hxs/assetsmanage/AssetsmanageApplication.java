package com.hxs.assetsmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hxs.assetsmanage.dao")
public class AssetsmanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssetsmanageApplication.class, args);
    }

}
