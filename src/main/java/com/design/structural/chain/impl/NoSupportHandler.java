package com.design.structural.chain.impl;


import com.design.structural.chain.service.RequesChainHandler;
import com.design.structural.chain.model.ChainRequest;
import lombok.extern.slf4j.Slf4j;

/**
 * 末节点的默认处理
 */
@Slf4j
public class NoSupportHandler extends RequesChainHandler {


    public NoSupportHandler(String name) {
        super(name);
    }

    @Override
    public Boolean excuteHandle(ChainRequest request) {
        return false;
    }
}