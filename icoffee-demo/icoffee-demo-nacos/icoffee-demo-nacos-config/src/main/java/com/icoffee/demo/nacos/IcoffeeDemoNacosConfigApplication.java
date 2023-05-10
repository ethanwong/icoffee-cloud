package com.icoffee.demo.nacos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class IcoffeeDemoNacosConfigApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(IcoffeeDemoNacosConfigApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("user.name");
        String userAge = applicationContext.getEnvironment().getProperty("user.age");
        System.err.println("user name :" + userName + "; age: " + userAge);

    }

    /**
     * 在nacos中添加配置文件 ${icoffee-demo-nacos-config}.yml 配置内容为
     * user:
     * name: nacos-config-yaml
     * age: 36
     */
    @RestController
    @RefreshScope
    public class EchoController {
        @Value("${user.name}")
        private String name;
        @Value("${user.age}")
        private String age;

        @GetMapping(value = "/echo")
        public String echo(@PathVariable String string) {
            return "Hello Nacos Config name is " + name + " age is " + age;
        }
    }

}
