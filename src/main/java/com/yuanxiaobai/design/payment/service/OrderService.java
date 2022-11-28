/*
 * Gongdao.com Inc.
 * Copyright (c) 2020-2034 All Rights Reserved.
 */
package com.yuanxiaobai.design.payment.service;

import com.yuanxiaobai.design.payment.service.constants.PayTypeEnum;

/**
 * 订单服务
 */
public interface OrderService {

    /**
     * 订单支付
     * @param payType
     * @param money
     */
    void payOrder(PayTypeEnum payType, Double money);
}
