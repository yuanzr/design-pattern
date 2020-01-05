package com.design.behavioral.strategy.strategy.impl;

import com.design.behavioral.strategy.strategy.BasePayStrategy;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class AppleStrategy implements BasePayStrategy {
    private static final Logger logger = LoggerFactory.getLogger(AppleStrategy.class);

    @Override
    public void excute() {
        logger.info("AppleStrategy===");
    }
}