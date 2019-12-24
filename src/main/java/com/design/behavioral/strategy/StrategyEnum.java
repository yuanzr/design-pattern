package com.design.behavioral.strategy;

import com.design.behavioral.strategy.impl.CarStrategy;
import com.design.behavioral.strategy.impl.GiftStrategy;
import com.design.behavioral.strategy.impl.HeadwearStrategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName: StrategyEnum
 * @Description: TODO
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/24/15:01
 */
public enum StrategyEnum {

    CAR((byte)1 , CarStrategy.class    ,"座驾策略"),
    GIFT((byte)2 , GiftStrategy.class    ,"礼物策略"),
    HEADWEAR((byte)3 , HeadwearStrategy.class    ,"头饰策略"),

    ;
    /** 策略类型 */
    private final Byte strategyType;

    /**
     * 勋章策略类
     */
    private final Class clazz ;

    /** 勋章描述 */
    private final String desc;

    /**
     * 构建一个枚举
     * @param strategyType 枚举值码。
     * @param desc 枚举描述。
     */
    StrategyEnum(Byte strategyType, Class clazz, String desc) {
        this.strategyType = strategyType;
        this.clazz = clazz ;
        this.desc = desc;
    }


    /**
     * 获取策略类型
     * @return 策略类型
     */
    public Byte getStrategyType() {
        return strategyType;
    }


    /**
     * 获取 class
     * @return class
     */
    public Class getClazz() {
        return clazz;
    }

    /**
     * 得到策略描述
     * @return 描述
     */
    public String getDesc() {
        return desc;
    }


    /**
     * 获取全部枚举值码。
     *
     * @return 全部枚举值码。
     */
    public static Map<Byte,String> getAllStatusCode() {
        Map<Byte,String> map = new ConcurrentHashMap<Byte, String>(16) ;
        for (StrategyEnum strategy : values()) {
            map.put(strategy.getStrategyType(),strategy.getDesc()) ;
        }
        return map;
    }

    public static Map<Byte,Class> getAllClazz() {
        Map<Byte,Class> map = new ConcurrentHashMap<Byte, Class>(16) ;
        for (StrategyEnum strategy : values()) {
            map.put(strategy.getStrategyType(),strategy.getClazz()) ;
        }
        return map;
    }


}
