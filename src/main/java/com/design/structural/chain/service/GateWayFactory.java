package com.design.structural.chain.service;


import com.design.structural.chain.GateWayChainHandler;
import com.design.structural.chain.impl.BlockFilterHandler;
import com.design.structural.chain.impl.CurrentLimitHandler;
import com.design.structural.chain.impl.SessionVarifyHandler;
import lombok.extern.slf4j.Slf4j;


/**
 * 获取网关实例
 */
@Slf4j
public class GateWayFactory {

    public static GateWayChainHandler getFristChain(){
        GateWayChainHandler gatewayHandler1 = new CurrentLimitHandler();
        GateWayChainHandler gatewayHandler2 = new BlockFilterHandler();
        gatewayHandler1.setNextChain(gatewayHandler2);
        GateWayChainHandler gatewayHandler3 = new SessionVarifyHandler();
        gatewayHandler2.setNextChain(gatewayHandler3);
        return gatewayHandler1;
    }

    public static void main(String[] args) {
        GateWayChainHandler chain = GateWayFactory.getFristChain();
        StringBuilder request = new StringBuilder("request:");
        chain.doChain(request);
    }
}
