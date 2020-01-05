package com.design.structural.chain.impl;

import com.design.structural.chain.GateWayChainHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 网关限流
 */
@Slf4j
public class CurrentLimitHandler extends GateWayChainHandler {


    @Override
    public void excute(StringBuilder request) {
        request = request.append("{limit}=》");
      log.info("1.对接口进行限流。。。{}",request.toString());
    }
}
