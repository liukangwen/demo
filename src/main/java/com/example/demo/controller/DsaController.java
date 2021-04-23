package com.example.demo.controller;


import com.example.demo.config.SendMailProperties;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lkw
 * @since 2021-04-21
 */
@RestController
@RequestMapping("//dsa")
@EnableConfigurationProperties(SendMailProperties.class)
public class DsaController {
    //    @Autowired
    @Resource
    private  SendMailProperties sendMailProperties;
    //    1.@Autowired是Spring开发的，而@Resource是jdk开发的
//2.@Autowired是按照type来注解的，而@Resource是按照名称来的，如果名称找不到，那么就按照type
    @GetMapping("/d")
    public String t()
    {
//        读取配置要加依赖
        String s =sendMailProperties.getFilePath();
        System.out.println(s);
        return "!";
    }
}
