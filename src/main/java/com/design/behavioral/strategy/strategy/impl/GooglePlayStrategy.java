package com.design.behavioral.strategy.strategy.impl;

import com.design.behavioral.strategy.strategy.BasePayStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class GooglePlayStrategy implements BasePayStrategy {

    @Override
    public void excute() {
        log.info("GooglePlayStrategy===");
    }
}