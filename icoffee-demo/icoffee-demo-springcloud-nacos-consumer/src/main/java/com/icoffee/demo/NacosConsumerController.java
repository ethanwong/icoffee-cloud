package com.icoffee.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class NacosConsumerController {


    private final RestTemplate restTemplate;

    @Autowired
    public NacosConsumerController(RestTemplate restTemplate) {this.restTemplate = restTemplate;}

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping(value = "/show/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        String result = restTemplate.getForObject("http://icoffee-cloud-demo-provider/echo/" + str, String.class);
        return "consumer:" + result;
    }


}
