package com.example.demo;

import com.example.demo.config.SendMailProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages = "com.example.demo.*")
@MapperScan("com.example.demo.mapper")
//@ComponentScan(basePackages = {"com.example.demo.config","com.example.demo.Test"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
