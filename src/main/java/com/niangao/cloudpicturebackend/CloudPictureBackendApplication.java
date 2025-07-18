package com.niangao.cloudpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.niangao.cloudpicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class CloudPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudPictureBackendApplication.class, args);
    }

}
