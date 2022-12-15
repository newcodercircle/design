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

@Duty(type = HandlerConstants.ORDER, order = 2)
@Component
public class SecurityHandler implements IHandler<String, String> {
    /**
     * 签名验证
     * @param s
     * @return
     */
    @Override
    public String handle(String s) {
        // 安全验证
        System.out.println("安全验证");
        return s;
    }

}
