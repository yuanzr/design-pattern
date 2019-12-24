package com.design.behavioral.strategy.impl;

import com.design.behavioral.strategy.IBaseStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ClassName: CarStrategy
 * @Description: 头饰策略
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/24/15:03
 */
@Slf4j
@Component
public class HeadwearStrategy implements IBaseStrategy {

    @Override
    public void process() {
        log.info("执行HeadwearStrategy策略");
    }

}
