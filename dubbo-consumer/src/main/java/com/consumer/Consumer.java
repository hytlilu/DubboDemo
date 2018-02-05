/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.consumer;

import com.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Consumer
 *
 * @author lilu
 * @since 2018-01-19
 */
public class Consumer {
    public static void main(String[] args){
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1L));
    }
}