package com.design.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName: Rectangle
 * @Description: 长方形
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/24/18:24
 */
@Slf4j
public class Rectangle implements Shape{
    @Override
    public void draw() {
      log.info("Rectangle:draw");
    }
}
