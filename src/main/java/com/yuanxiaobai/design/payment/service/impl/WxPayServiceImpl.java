/*
 * Gongdao.com Inc.
 * Copyright (c) 2020-2034 All Rights Reserved.
 */
package com.yuanxiaobai.design.payment.service.impl;

import com.yuanxiaobai.design.payment.service.PayService;
import com.yuanxiaobai.design.payment.service.constants.PayTypeEnum;
import org.springframework.stereotype.Service;

/**
 * @author xiaowu.zxw
 * @version 2022年11月27日 9:58 AM
 */
@Service
public class WxPayServiceImpl implements PayService {
    /**
     * 支付
     *
     * @param money
     */
    @Override
    public void pay(Double money) {
        System.out.println("微信支付:"+money + "元");
    }

    /**
     * 支付类型
     *
     * @return
     */
    @Override
    public PayTypeEnum payType() {
        return PayTypeEnum.WX;
    }
}
