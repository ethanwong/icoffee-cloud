package com.icoffee.demo;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @DubboReference
    private IHelloService iHelloService;


    @GetMapping("/say/{word}")
    public String sayHello(@PathVariable String word) {
        return iHelloService.sayHello(word);
    }
}
