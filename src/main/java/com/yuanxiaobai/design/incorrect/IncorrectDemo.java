/*
 * Gongdao.com Inc.
 * Copyright (c) 2020-2034 All Rights Reserved.
 */
package com.yuanxiaobai.design.incorrect;

/**
 * 错误示范
 * @author yuanxiaobai
 */
public class IncorrectDemo {

    public static void main(String[] args) {

    }


    /**
     * 支付选择简易逻辑
     *
     * @param payType payType zfb-支付宝支付,wx-微信支付
     * @param money   需要支付的钱
     */
    public void pay(String payType, Double money) {
        if ("zfb".equals(payType)) {
            System.out.println("=======执行支付宝支付========");
        } else if ("wx".equals(payType)) {
            System.out.println("=======执行支微信支付========");
        } else {
            System.out.println("=======支付类型错误========");
        }
    }

}
