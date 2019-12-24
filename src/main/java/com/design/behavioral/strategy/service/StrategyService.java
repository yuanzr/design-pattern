package com.design.behavioral.strategy.service;

import com.design.behavioral.strategy.StrategyFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: StrategyService
 * @Description: TODO
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/24/15:11
 */
@Slf4j
@Service
public class StrategyService {

    @Autowired
    private StrategyFactory factory;

    public void doWork(Byte strategyType){
        factory.getStrategy(strategyType).process();
    }

}
