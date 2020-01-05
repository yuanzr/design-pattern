package com.design.structural.chain;


import com.design.structural.chain.model.ChainRequest;
import com.design.structural.chain.service.RequesChainHandler;
import lombok.extern.slf4j.Slf4j;


/**
 * 获取网关实例
 */
@Slf4j
public class GateWayFactory {

    public static void main(String[] args) {
        RequesChainHandler chain = RequesChainHandler.getFristNode();
//        ChainRequest request = new ChainRequest(6);
//        chain.doChain(request);
        for (int i = 0; i < 40; i++) {
            ChainRequest request = new ChainRequest(i);
            chain.doChain(request);

        }
    }

}
