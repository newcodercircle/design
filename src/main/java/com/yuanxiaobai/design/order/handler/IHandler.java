/*
 * Gongdao.com Inc.
 * Copyright (c) 2020-2034 All Rights Reserved.
 */
package com.yuanxiaobai.design.order.handler;

/**
 * @author yudeng
 * @version 2022年12月14日 7:51 PM
 */
public interface IHandler<T, R>  {
    /**
     * 抽象处理类
     * @param t
     * @return
     */
    R handle(T t);
}
