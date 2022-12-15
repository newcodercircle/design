/*
 * Gongdao.com Inc.
 * Copyright (c) 2020-2034 All Rights Reserved.
 */
package com.yuanxiaobai.design.order.handler;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.yuanxiaobai.design.order.annotation.Duty;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.CollectionUtils;

/**
 * @author yudeng
 * @version 2022年12月14日 7:52 PM
 */
public class HandleChainManager {
    /**
     * 存放责任链路上的具体处理类
     * k-具体业务场景名称
     * v-具体业务场景下的责任链路集合
     */
    private Map<String, List<IHandler>> handleMap;

    /**
     * 存放系统中责任链具体处理类
     * @param handlerList
     */
    public void setHandleMap(List<IHandler> handlerList) {
        handleMap = handlerList
            .stream()
            .sorted(Comparator.comparingInt(h -> AnnotationUtils.findAnnotation(h.getClass(), Duty.class).order()))
            .collect(Collectors.groupingBy(handler -> AnnotationUtils.findAnnotation(handler.getClass(), Duty.class).type()));
    }

    /**
     * 执行具体业务场景中的责任链集合
     * @param type 对应@Duty注解中的type，可以定义为具体业务场景
     * @param t 被执行的参数
     */
    public <T,R>  R executeHandle(String type, T t) {
        List<IHandler> handlers = handleMap.get(type);
        R r = null;

        if (CollectionUtils.isEmpty(handlers)) {
            return null;
        }

        for (IHandler<T, R> handler : handlers) {
            r = handler.handle(t);
        }

        return r;
    }
}
