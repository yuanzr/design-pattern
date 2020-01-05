package com.design.structural.chain.impl;

import com.design.structural.chain.service.RequesChainHandler;
import com.design.structural.chain.model.ChainRequest;
import lombok.extern.slf4j.Slf4j;

/**
 * 网关限流
 */
@Slf4j
public class CurrentLimitHandler extends RequesChainHandler {

    private int specialNumber;

    public CurrentLimitHandler() {
    }

    public CurrentLimitHandler(String name,int specialNumber) {
        super(name);
        this.specialNumber = specialNumber;
    }

    @Override
    public Boolean excuteHandle(ChainRequest request) {
        return request.getNumber() == specialNumber ? true : false;
    }
}
