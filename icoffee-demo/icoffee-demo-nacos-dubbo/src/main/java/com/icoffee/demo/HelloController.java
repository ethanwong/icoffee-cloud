package com.icoffee.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/say/{word}")
    public String sayHello(@PathVariable String word) {
        return word;
    }
}
