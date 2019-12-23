package com.design.behavioral.template.service;

import com.design.behavioral.template.BaseAbstractClass;
import org.springframework.stereotype.Component;

/**
 * @ClassName: ConcreteClassA
 * @Description: TODO
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/23/11:25
 */
@Component
public class ConcreteClassAService extends BaseAbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("具体类A方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类A方法2实现");
    }
}
