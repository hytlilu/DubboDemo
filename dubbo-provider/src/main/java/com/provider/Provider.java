/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Provider
 *
 * @author lilu
 * @since 2018-01-19
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}