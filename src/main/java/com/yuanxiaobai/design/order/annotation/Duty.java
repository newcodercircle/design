/*
 * Gongdao.com Inc.
 * Copyright (c) 2020-2034 All Rights Reserved.
 */
package com.yuanxiaobai.design.order.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yudeng
 * @version 2022年12月14日 7:48 PM
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Duty {
    /**
     * 标记具体业务场景
     * @return
     */
    String type() default "";

    /**
     * 排序：数值越小，排序越前
     * @return
     */
    int order() default 0;
}
