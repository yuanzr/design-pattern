package com.design.creational.singleton;

/**
 * @ClassName: LazySyncSingleton
 * @Description: TODO
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/23/14:30
 */
public class LazySyncSingleton {

    private static LazySyncSingleton instance ;

    private LazySyncSingleton() {
    }


    public static synchronized LazySyncSingleton getInstance() {
        if (instance == null) {
            instance = new LazySyncSingleton();
        }
        return instance;
    }
}
