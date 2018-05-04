package com.spring.demo.springbootexample.controller;

import com.spring.demo.springbootexample.mybatis.mapper.HelloMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    //替换成自己生成的mapper
    @Autowired
    HelloMapper helloMapper;

    @RequestMapping("/test")
    @ResponseBody
    public Object test(){
        //查询该表的所有数据
        return helloMapper.selectByExample(null);
    }
}