package com.design.structural.chain.impl;

import com.design.structural.chain.service.RequesChainHandler;
import com.design.structural.chain.model.ChainRequest;
import lombok.extern.slf4j.Slf4j;

/**
 * 过滤黑名单
 */
@Slf4j
public class BlockFilterHandler extends RequesChainHandler {


    public BlockFilterHandler() {
    }

    public BlockFilterHandler(String name) {
        super(name);
    }

    @Override
    public Boolean excuteHandle(ChainRequest request) {
      return (request.getNumber()%2) == 1 ? true : false;
    }
}
