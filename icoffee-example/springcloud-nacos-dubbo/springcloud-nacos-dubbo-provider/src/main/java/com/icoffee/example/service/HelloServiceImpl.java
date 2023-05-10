package com.icoffee.example.service;

import com.icoffee.example.IHelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String word) {
        return word;
    }
}
