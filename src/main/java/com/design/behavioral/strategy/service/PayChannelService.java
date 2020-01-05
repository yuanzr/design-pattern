package com.design.behavioral.strategy.service;


/**
 * 支付渠道
 */
public interface PayChannelService {

    /**
     * 使用SpringBeanUtils实现策略模式
     * @param type
     * @return
     */
    void excutePayByBeanUtils(Byte type);

    /**
     * 使用工厂模式实现策略模式
     * @param type
     * @return
     */
    void excutePayByFactory(Byte type);
}
