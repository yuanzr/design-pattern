package com.design.creational.singleton;

/**
 * @ClassName: EnumSingleton
 * @Description: 枚举
 *               这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化
 *               它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化
 *               不能通过 reflection attack 来调用私有构造方法。
 *
 *               使用SingletonEnum.INSTANCE进行访问，这样也就避免调用getInstance方法，更重要的是使用枚举单例的写法，我们完全不用考虑序列化和反射的问题。
 *               jvm保证了每个枚举实例变量的唯一性,因为创建枚举实例只有编译器能够做到,使用不能反射创建枚举类
 *
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/23/18:20
 */
public enum  EnumSingleton {


    INSTANCE;

    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    /**
     * 需要被调用的方法
     */
    public void doWork() {

    }


}
