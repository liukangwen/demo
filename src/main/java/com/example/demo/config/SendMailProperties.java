package com.example.demo.config;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//springboot读取自定义需要加依赖，其次main和test时读取不了注入bean
@Data
@Component//
@ConfigurationProperties(prefix = "sendmail")//读取前缀为 config 的内容
@PropertySource(value = {"classpath:config/config.properties"},encoding = "utf-8") //定义了要读取的properties文件的位置
public class SendMailProperties {
//    @Value("${sendmail.sender}")
    private String sender;
//    @Value("${sendmail.filePath}")
    private String filePath;
}
