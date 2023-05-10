package com.icoffee.demo.rest;

import com.icoffee.demo.config.CommonApplicationConfig;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @name InfoController
 * @description 基本信息控制器
 * @since 2023-05-08 11:41
 */
@RestController
@Log4j2
@RefreshScope
public class InfoController {
    @Autowired
    private CommonApplicationConfig commonApplicationConfig;
    @Value("${common.application.name}")
    private String name2;

    @GetMapping("")
    public String info() {
        String name = commonApplicationConfig.getName();
        log.info("the name is {} name2 is {}",name,name2);
        return name;
    }

}
