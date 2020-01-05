package com.design.behavioral.strategy.utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 支付渠道策略的枚举类
 */
public enum PayStrategyBeanEnum {

        ALIPAY((byte)1 , "alipayStrategy"     ,"支付宝"),
        WECAHT((byte)2 , "weChatStrategy"     ,"微信"),
    GOOGLEPLAY((byte)3 , "googlePlayStrategy" ,"google play"),
         APPLE((byte)4 , "appleStrategy"       ,"apple"),
     UNIOINPAY((byte)5 , "unionPayStrategy"   ,"银联")

    ;

    /**
     * 策略编号
     */
    private final Byte code;

    /**
     * 策略类
     */
    private final String beanName;

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
    PayStrategyBeanEnum(Byte code, String beanName, String desc) {
        this.code = code;
        this.beanName = beanName;
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
    public String getBeanName() {
        return beanName;
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
        for (PayStrategyBeanEnum strategy : values()) {
            map.put(strategy.getCode(), strategy.getDesc());
        }
        return map;
    }

    public static Map<Byte, String> getAllBeanNames() {
        Map<Byte, String> map = new ConcurrentHashMap<Byte, String>(16);
        for (PayStrategyBeanEnum strategy : values()) {
            map.put(strategy.getCode(), strategy.getBeanName());
        }
        return map;
    }

    /**
     * 根据code获取clazz
     * @param code
     * @return
     */
    public static String getBeanNames(Byte code) {
        Map<Byte, String> allBeanNames = PayStrategyBeanEnum.getAllBeanNames();
        String beanNames = allBeanNames.get(code);
        return beanNames;
    }

}
