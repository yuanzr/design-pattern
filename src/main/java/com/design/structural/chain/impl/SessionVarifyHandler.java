package com.design.structural.chain.impl;

import com.design.structural.chain.service.RequesChainHandler;
import com.design.structural.chain.model.ChainRequest;
import lombok.extern.slf4j.Slf4j;

/**
 * Session校验
 */
@Slf4j
public class SessionVarifyHandler extends RequesChainHandler {


    private int limit;


    public SessionVarifyHandler() {
    }

    public SessionVarifyHandler(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    public Boolean excuteHandle(ChainRequest request) {
        return request.getNumber() <= limit? true : false;
    }
}
