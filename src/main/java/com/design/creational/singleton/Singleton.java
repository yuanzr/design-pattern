package com.design.creational.singleton;


/**
 * @ClassName: Singleton
 * @Description: 饿汉式
 *               基于classloder机制避免了多线程的同步问题
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/23/14:30
 */
public class Singleton {
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
