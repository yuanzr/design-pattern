package com.design.behavioral.template.service;

import com.design.behavioral.template.BaseAbstractClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ClassName: ConcreteClassB
 * @Description: TODO
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/23/11:27
 */
@Slf4j
@Component
public class ConcreteClassBService  extends BaseAbstractClass {
    @Override
    public void primitiveOperation1() {

        System.out.println("具体类B方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类B方法2实现");
    }
}
