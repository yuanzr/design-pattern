package com.design.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName: ProxyPatternClient
 * @Description: TODO
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/24/18:35
 */
@Slf4j
public class ProxyPatternClient {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        log.info("========");
        // 图像不需要从磁盘加载
        image.display();
    }
}
