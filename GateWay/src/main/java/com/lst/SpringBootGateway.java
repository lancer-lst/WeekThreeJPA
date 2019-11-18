package com.lst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * gateway启动器
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringBootGateway {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootGateway.class,args);
    }
}
