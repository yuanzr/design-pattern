package com.design.behavioral.template.controller;

import com.design.behavioral.template.service.ConcreteClassAService;
import com.design.behavioral.template.service.ConcreteClassBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TemplateController
 * @Description: TODO
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/23/11:44
 */
@RestController
public class TemplateController {

    @Autowired
    ConcreteClassAService concreteClassAService;
    @Autowired
    ConcreteClassBService concreteClassBService;



}
