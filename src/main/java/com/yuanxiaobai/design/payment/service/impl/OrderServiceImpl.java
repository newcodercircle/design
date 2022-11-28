/*
 * Gongdao.com Inc.
 * Copyright (c) 2020-2034 All Rights Reserved.
 */
package com.yuanxiaobai.design.payment.service.impl;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.yuanxiaobai.design.payment.service.OrderService;
import com.yuanxiaobai.design.payment.service.PayService;
import com.yuanxiaobai.design.payment.service.constants.PayTypeEnum;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yudeng
 * @version 2022年11月27日 10:01 AM
 */
@Service
public class OrderServiceImpl implements OrderService, InitializingBean {

    @Autowired
    private List<PayService> payServiceList;

    private static final Map<PayTypeEnum, PayService> payRouters = new ConcurrentHashMap<>();

    /**
     * 订单支付
     *
     * @param payType
     * @param money
     */
    @Override
    public void payOrder(PayTypeEnum payType, Double money) {
        if (payType == null){
            throw new RuntimeException("支付类型为空");
        }
        PayService payService = payRouters.get(payType);
        payService.pay(money);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        for (PayService service : payServiceList){
            payRouters.put(service.payType(), service);
        }
    }
}
