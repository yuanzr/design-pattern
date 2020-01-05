package com.design.structural.chain.impl;

import com.design.structural.chain.GateWayChainHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Session校验
 */
@Slf4j
public class SessionVarifyHandler extends GateWayChainHandler {


    @Override
    public void excute(StringBuilder request) {
       request = request.append("{limit}=》");
      log.info("3.session参数校验。。。{}",request.toString());

    }
}
