/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.api;

import java.util.List;

/**
 * DemoService
 *
 * @author lilu
 * @since 2018-01-19
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}
