package com.design.behavioral.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName: AbstractClass
 * @Description: 模板方法模式，定义一个操作中的算法骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤。
 *
 * AbstractClass: 实现一个模板方法，定义了算法的骨架，具体子类将重定义PrimitiveOperation以实现一个算法的步骤。
 *                AbstractClass其实就是一个抽象模板，定义并实现了一个模板方法。这个模板方法一般是一个具体的方法。
 *                它给出了一个顶级逻辑的骨架，而逻辑的组成步骤在相应的抽象操作中，推迟到子类实现。顶级逻辑也有可能调用一些具体方法。
 *
 * ConcreteClasses: 实现PrimitiveOperation以完成算法与特定子类相关的步骤。
 *                  ConcreteClass实现父类所定义的一个或多个抽象方法。
 *                  每一个AbstractClass都可以有任意多个ConcreteClass与之对应，而每一个ConcreteClass都可以给出这些抽象方法（也就是顶级逻辑的组成步骤）的不同实现，从而使得顶级逻辑的实现各不相同。
 *
 *
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/23/11:20
 */
@Slf4j
public abstract class BaseAbstractClass{
    @Autowired
    TemplateSpringService templateSpringService;


    /**
     * 模板方法，给出了逻辑的骨架
     * 而逻辑的组成是一些相应的抽象操作，他们都推迟到子类实现
     * 在结合Spring框架使用时,可以在此抽象类中注入bean
     */
    public void templateMethod() {
        templateSpringService.getTemplate();//调用spring中bean的方法
        primitiveOperation1();
        primitiveOperation2();
        log.info("BaseAbstractClass-templateMethod");
    }

    /**
     * 子类需要实现的方法
     */
    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();

}
