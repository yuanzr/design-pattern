package com.design.creational.singleton;

/**
 * @ClassName: DoubleCheckedLockingSingleton
 * @Description: 双检锁/双重校验锁
 *               能够在多线程中很好的工作避免同步问题，同时也具备lazy loading机制，遗憾的是，由于synchronized的存在，效率很低
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/23/16:02
 */
public class DoubleCheckedLockingSingleton {

    private volatile static DoubleCheckedLockingSingleton singleton;

    private DoubleCheckedLockingSingleton() {
    }

    /**
     * 主要在getSingleton()方法中，进行两次null检查
     * 这样可以极大提升并发度，进而提升性能
     * @return
     */
    public static DoubleCheckedLockingSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return singleton;
    }
}
