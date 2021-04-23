package com.example.demo.controller;


import com.example.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author lkw
 * @since 2021-04-22
 */
@RestController
@RequestMapping("//sys-user")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/sw")
    public String getS(){
        redisTemplate.opsForValue().set("k","name");
        System.out.println(redisTemplate.opsForValue().get("k"));
        return "sw";
    }
}
