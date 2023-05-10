package com.icoffee.example;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @name DentinelApplication
 * @description
 * @since 2023-05-10 18:07
 */
@SpringBootApplication
public class SpringCloudSentinelApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSentinelApplication.class, args);
    }

    @RestController
    public class TestController {
        @GetMapping(value = "/hello")
        @SentinelResource("hello")
        public String hello() {
            return "Hello Sentinel";
        }
    }
}
