/*
 * Gongdao.com Inc.
 * Copyright (c) 2020-2034 All Rights Reserved.
 */
package com.yuanxiaobai.design.payment.service;

import com.yuanxiaobai.design.payment.service.constants.PayTypeEnum;

/**
 * 支付服务
 * @author yuanxiaobai
 */
public interface PayService {

    /**
     * 支付
     * @param money
     */
    void pay(Double money);

    /**
     * 支付类型
     * @return
     */
    PayTypeEnum payType();

}
