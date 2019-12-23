package com.design.behavioral.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassName: TemplateSpringService
 * @Description: TODO
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/23/11:39
 */
@Slf4j
@Service
public class TemplateSpringService {

    public void getTemplate(){
      log.info("TemplateSpringService-getTemplate");
    }

}
