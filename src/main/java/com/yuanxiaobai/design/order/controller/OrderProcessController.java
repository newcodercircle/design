/*
 * Gongdao.com Inc.
 * Copyright (c) 2020-2034 All Rights Reserved.
 */
package com.yuanxiaobai.design.order.controller;

import javax.annotation.Resource;

import com.yuanxiaobai.design.order.handler.HandleChainManager;
import com.yuanxiaobai.design.order.constants.HandlerConstants;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yudeng
 * @version 2022年12月14日 8:06 PM
 */
@RestController
@RequestMapping("/api/order")
public class OrderProcessController {

    @Resource
    private HandleChainManager handleChainManager;

    @PostMapping("/process")
    public String process(@RequestBody String requestBody) {
        String response = handleChainManager.executeHandle(HandlerConstants.ORDER, requestBody);
        return response;
    }


}
