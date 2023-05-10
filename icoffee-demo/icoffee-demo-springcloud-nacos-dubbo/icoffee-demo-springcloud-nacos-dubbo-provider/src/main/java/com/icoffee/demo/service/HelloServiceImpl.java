package com.icoffee.demo.service;

import com.icoffee.demo.IHelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String word) {
        return word;
    }
}
