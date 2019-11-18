package com.lst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eurekaserver启动器
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringBootEurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootEurekaServer.class,args);
    }
}
