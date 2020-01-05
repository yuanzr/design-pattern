package com.design;

import com.design.behavioral.strategy.utils.PayStrategyBeanEnum;
import com.design.behavioral.strategy.service.PayChannelService;
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
    private PayChannelService payChannelService;

    @Test
    void contextLoads() {
    }

    @Test
    void strategyTest() {
        payChannelService.excutePayByBeanUtils(PayStrategyBeanEnum.ALIPAY.getCode());
//        payChannelService.excutePayByFactory(PayStrategyFactoryEnum.ALIPAY.getCode());
    }
}
