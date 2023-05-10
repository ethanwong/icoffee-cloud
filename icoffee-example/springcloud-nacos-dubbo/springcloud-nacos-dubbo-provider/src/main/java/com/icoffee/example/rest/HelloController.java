package com.icoffee.example.rest;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Log
public class HelloController {


    @Value("${dubbo.protocol.port}")
    private String dubboPort;

    private String serviceName = "Service Provider Port:" + dubboPort;

    @GetMapping("/say/{word}")
    public String sayHello(@PathVariable String word) {
        return serviceName + " say:" + word;
    }


}
