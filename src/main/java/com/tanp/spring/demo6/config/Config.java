package com.tanp.spring.demo6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author CodeBricklayer
 * @ClassName Config
 * @Description 配置类 不需要创建xml配置
 * @date 2021/4/27 23:23
 */
@Configuration
@ComponentScan(basePackages = "com.tanp.spring.demo6")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Config {
}
