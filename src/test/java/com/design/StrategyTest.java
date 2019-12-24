package com.design;

import com.design.behavioral.strategy.StrategyEnum;
import com.design.behavioral.strategy.service.StrategyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName: StrategyTest
 * @Description: 策略模式测试类
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/24/15:17
 */
@SpringBootTest
public class StrategyTest {
    @Autowired
    private StrategyService strategyService;

    @Test
    void contextLoads() {
        strategyService.doWork(StrategyEnum.CAR.getStrategyType());
        strategyService.doWork(StrategyEnum.GIFT.getStrategyType());
        strategyService.doWork(StrategyEnum.HEADWEAR.getStrategyType());
    }

}
