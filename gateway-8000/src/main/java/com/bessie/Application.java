package com.bessie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient   // 开启服务注册与发现功能，网关也是一个微服务节点，也需要注册和被发现
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}