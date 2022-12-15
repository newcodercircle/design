/*
 * Gongdao.com Inc.
 * Copyright (c) 2020-2034 All Rights Reserved.
 */
package com.yuanxiaobai.design.order.handler.impl;

import com.yuanxiaobai.design.order.annotation.Duty;
import com.yuanxiaobai.design.order.constants.HandlerConstants;
import com.yuanxiaobai.design.order.handler.IHandler;
import org.springframework.stereotype.Component;

/**
 * @author yudeng
 * @version 2022年12月14日 8:02 PM
 */

@Duty(type = HandlerConstants.ORDER, order = 3)
@Component
public class BlackListHandler implements IHandler<String, String> {
    /**
     * 处理加签逻辑
     * @param s
     * @return
     */
    @Override
    public String handle(String s) {
        // 黑名单验证
        System.out.println("黑名单验证");
        return s;
    }
}
