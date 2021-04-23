package com.example.demo;


import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
//@Slf4j
//路径com.example.demo默认会进来不用扫描,只要这些controller在启动同级或者子集路径就可以，否则需要指定
public class ControllerTest {
//    protected Logger logger = LoggerFactory.getLogger(getClass());
    static Logger logger = LoggerFactory.getLogger(ControllerTest.class);

    @Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;

    @RequestMapping("/hello")
//    @ResponseBody
    public String get(){
        return "Wecome to china"+"fsdasd";
    }

    @RequestMapping("/testValue")
    public String getNameAndAge(){
        logger.info("==========日志测试=======");
        logger.info("==========日志测试=======");
        logger.info("==========日志测试333=======");
//        log.info("====");

        return "name是"+name+"年龄是"+age;
    }

//    public static void main(String[] args) {//快速获取到spring.factories
//        System.out.println(SpringApplication.class.getClassLoader().getResource("META-INF/spring.factories"));
//    }

//    public static void main(String[] args) {
//        logger.info("----------------------");
//        System.out.println(111);
//    }
}
