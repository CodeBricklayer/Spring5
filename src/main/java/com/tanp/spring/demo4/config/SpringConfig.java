package com.tanp.spring.demo4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author CodeBricklayer
 * @ClassName SpringConfig
 * @Description Spring配置类 替代xml配置文件
 * @date 2021/4/27 21:21
 */
@Configuration
@ComponentScan(basePackages = {"com.tanp.spring.demo4"})
public class SpringConfig {

}
