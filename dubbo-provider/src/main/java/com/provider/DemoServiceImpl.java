/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.provider;

import com.api.DemoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * DemoServiceImpl
 *
 * @author lilu
 * @since 2018-01-19
 */
public class DemoServiceImpl implements DemoService {
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d",id-1));
        demo.add(String.format("Permission_%d",id));
        demo.add(String.format("Permission_%d",id+1));
        return demo;
    }
}