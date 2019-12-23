package com.design.creational.singleton;

/**
 * @ClassName: LazySyncSingleton
 * @Description: 懒汉式,线程不安全
 *   这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。
 *   因为没有加锁 synchronized，所以严格意义上它并不算单例模式。 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/23/14:30
 */
public class LazySingleton {

    private static LazySingleton instance ;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
