package com.icoffee.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @name CommonConfig
 * @description
 * @since 2023-05-08 11:30
 */
@Component
/**
 * 实现配置文件修改，bean自动刷新功能
 */
@RefreshScope
@Data
@ConfigurationProperties(prefix = "common.application")
public class CommonApplicationConfig {
    private String name;
}
