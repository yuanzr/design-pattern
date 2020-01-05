package com.design.behavioral.strategy.service.impl;

import com.design.behavioral.strategy.utils.PayStrategyBeanEnum;
import com.design.behavioral.strategy.utils.SpringBeanUtils;
import com.design.behavioral.strategy.factory.PayStrategyFactory;
import com.design.behavioral.strategy.strategy.BasePayStrategy;
import com.design.behavioral.strategy.service.PayChannelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class PayChannelServiceImpl implements PayChannelService {


    @Autowired
    private PayStrategyFactory factory;

    @Autowired
    SpringBeanUtils springBeanUtils;

    @Override
    public void excutePayByBeanUtils(Byte type) {
        BasePayStrategy bean = springBeanUtils.getBean(PayStrategyBeanEnum.getBeanNames(type), BasePayStrategy.class);
        bean.excute();
    }

    @Override
    public void excutePayByFactory(Byte type) {
        factory.getStrategy(type).excute();
    }

}
