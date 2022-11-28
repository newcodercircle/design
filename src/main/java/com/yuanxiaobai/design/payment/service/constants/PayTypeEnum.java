/*
 * Gongdao.com Inc.
 * Copyright (c) 2020-2034 All Rights Reserved.
 */
package com.yuanxiaobai.design.payment.service.constants;

/**
 * 支付类型
 */
public enum PayTypeEnum {
    /**
     * 支付宝
     */
    ZFB("zfb","支付宝"),

    /**
     * 微信
     */
    WX("wx","微信"),

    /**
     * 云闪付
     */
    YSF("ysf","云闪付")

    ;

    PayTypeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static PayTypeEnum getPayTypeByCode(String code){
        for (PayTypeEnum e : PayTypeEnum.values()){
            if (e.getCode().equals(code)){
                return e;
            }
        }

        return null;
    }

    private String code;

    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
