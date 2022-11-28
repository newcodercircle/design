/*
 * Gongdao.com Inc.
 * Copyright (c) 2020-2034 All Rights Reserved.
 */
package com.yuanxiaobai.design.payment.controller;

import com.yuanxiaobai.design.payment.service.OrderService;
import com.yuanxiaobai.design.payment.service.constants.PayTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单
 * @author yudeng
 * @version 2022年11月27日 10:12 AM
 */
@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/payOrder")
    public String payOrder(@RequestParam String payType , @RequestParam Double money){

        PayTypeEnum payTypeEnum = PayTypeEnum.getPayTypeByCode(payType);
        if (payTypeEnum == null){
            return "不支持当前的支付方式";
        }

        orderService.payOrder(payTypeEnum,money);
        return String.format("使用%s支付成功%.2f元",payTypeEnum.getMessage() , money);
    }

}
