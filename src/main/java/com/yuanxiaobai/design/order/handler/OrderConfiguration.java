/*
 * Gongdao.com Inc.
 * Copyright (c) 2020-2034 All Rights Reserved.
 */
package com.yuanxiaobai.design.order.handler;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yudeng
 * @version 2022年12月14日 7:57 PM
 */
@Configuration
public class OrderConfiguration {

    @Bean
    public HandleChainManager handlerChainExecute(List<IHandler> handlers) {
        HandleChainManager handleChainManager = new HandleChainManager();
        handleChainManager.setHandleMap(handlers);
        return handleChainManager;
    }

}
