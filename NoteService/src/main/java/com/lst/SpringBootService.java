package com.lst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * service启动类
 */
@EnableEurekaClient
@SpringBootApplication
public class SpringBootService {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootService.class,args);
    }
}
