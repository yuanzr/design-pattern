package com.design.behavioral.strategy.factory;

import com.design.behavioral.strategy.strategy.impl.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 支付渠道策略的枚举类
 */
public enum PayStrategyFactoryEnum {

        ALIPAY((byte)1 , AlipayStrategy.class     ,"支付宝"),
        WECAHT((byte)2 , WeChatStrategy.class     ,"微信"),
    GOOGLEPLAY((byte)3 , GooglePlayStrategy.class ,"google play"),
         APPLE((byte)4 , AppleStrategy.class      ,"apple"),
     UNIOINPAY((byte)5 , UnionPayStrategy.class   ,"银联")

    ;

    /**
     * 策略编号
     */
    private final Byte code;

    /**
     * 策略类
     */
    private final Class clazz;

    /**
     * 策略描述
     */
    private final String desc;

    /**
     * 构建一个枚举
     *
     * @param code 枚举值码。
     * @param desc 枚举描述。
     */
    PayStrategyFactoryEnum(Byte code, Class clazz, String desc) {
        this.code = code;
        this.clazz = clazz;
        this.desc = desc;
    }


    /**
     * 得到勋章编号
     *
     * @return 勋章编号
     */
    public Byte getCode() {
        return code;
    }

    /**
     * 获取 class
     *
     * @return class
     */
    public Class getClazz() {
        return clazz;
    }

    /**
     * 得到勋章描述
     *
     * @return 勋章描述
     */
    public String getDesc() {
        return desc;
    }


    /**
     * 获取全部枚举值码。
     *
     * @return 全部枚举值码。
     */
    public static Map<Byte, String> getAllDesc() {
        Map<Byte, String> map = new ConcurrentHashMap<Byte, String>(16);
        for (PayStrategyFactoryEnum strategy : values()) {
            map.put(strategy.getCode(), strategy.getDesc());
        }
        return map;
    }

    public static Map<Byte, Class> getAllClazz() {
        Map<Byte, Class> map = new ConcurrentHashMap<Byte, Class>(16);
        for (PayStrategyFactoryEnum strategy : values()) {
            map.put(strategy.getCode(), strategy.getClazz());
        }
        return map;
    }

    /**
     * 根据code获取clazz
     * @param code
     * @return
     */
    public static Class getClazz(Byte code) {
        Map<Byte, Class> allClazz = PayStrategyFactoryEnum.getAllClazz();
        Class clazz = allClazz.get(code);
        return clazz;
    }

}
