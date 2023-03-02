package com.icoffee.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Value("${appname}")
    private String name;


    @GetMapping("/get/name")
    public String getName() {
        return name;
    }

    @GetMapping("/hello/say/{say}")
    public String sayWhat(@PathVariable String say) {
        return say;
    }


    @Value("${useLocalCache}")
    private boolean useLocalCache;

    /**
     * http://localhost:8080/config/get
     */
    @RequestMapping("/get")
    public boolean get() {
        return useLocalCache;
    }
}
