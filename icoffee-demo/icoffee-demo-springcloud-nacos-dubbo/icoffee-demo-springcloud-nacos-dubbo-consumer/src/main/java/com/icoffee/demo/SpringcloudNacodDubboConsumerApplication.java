package com.icoffee.demo;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@DubboComponentScan(basePackages = "com.icoffee.demo")
public class SpringcloudNacodDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudNacodDubboConsumerApplication.class, args);
    }


}
