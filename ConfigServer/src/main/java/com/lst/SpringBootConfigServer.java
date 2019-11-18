package com.lst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心
 */
@SpringBootApplication
@EnableConfigServer
public class SpringBootConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigServer.class,args);
    }
}
