package com.design.structural.chain.impl;

import com.design.structural.chain.GateWayChainHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 过滤黑名单
 */
@Slf4j
public class BlockFilterHandler extends GateWayChainHandler {


    @Override
    public void excute(StringBuilder request) {
      request = request.append("{block}=》");
      log.info("2.黑名单用户进行过滤。。。{}",request.toString());

    }
}
