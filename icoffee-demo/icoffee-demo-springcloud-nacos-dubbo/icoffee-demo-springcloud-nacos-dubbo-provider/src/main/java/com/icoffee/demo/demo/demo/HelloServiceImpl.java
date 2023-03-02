package com.icoffee.demo.demo.demo;

import com.icoffee.demo.demo.IHelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String word) {
        return word;
    }
}
