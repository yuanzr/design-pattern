package com.design.behavioral.strategy.strategy.impl;

import com.design.behavioral.strategy.strategy.BasePayStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 支付宝支付
 */
@Slf4j
@Component
public class AlipayStrategy implements BasePayStrategy {

    @Override
    public void excute() {
        log.info("支付宝支付===");
    }
}
