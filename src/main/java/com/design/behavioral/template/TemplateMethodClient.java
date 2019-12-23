package com.design.behavioral.template;

import com.design.behavioral.template.service.ConcreteClassAService;
import com.design.behavioral.template.service.ConcreteClassBService;

/**
 * @ClassName: TemplateMethodClient
 * @Description: TODO
 *
 * 模板方法模式的总结:
 *
 * （1）模板方法模式的优点
 * ①模板方法模式通过把不变的行为搬移到父类，去除了子类中的重复代码。
 * ②子类实现算法的某些细节，有助于算法的扩展。
 * ③通过一个父类调用子类实现的操作，通过子类扩展增加新的行为，符合“开放-封闭原则”。
 *
 * （2）模板方法模式的缺点
 * 按照设计习惯，抽象类负责声明最抽象、最一般的事物属性和方法，实现类负责完成具体的事务属性和方法，
 * 但是模板方式正好相反，子类执行的结果影响了父类的结果，会增加代码阅读的难度。
 *
 * （3）模板方法模式适合的场景
 * ①多个子类有共有的方法，并且逻辑基本相同。
 * ②重要、复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现。
 * ③重构时，模板方法是一个经常使用的方法，把相同的代码抽取到父类中，然后通过构造函数约束其行为。
 *
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/23/11:34
 */
public class TemplateMethodClient {

    public static void main(String[] args) {

        BaseAbstractClass aClass = new ConcreteClassAService();
        aClass.templateMethod();

        BaseAbstractClass bClass = new ConcreteClassBService();
        bClass.templateMethod();
    }

}
