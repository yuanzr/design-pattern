package com.design.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName: ProxyImage
 * @Description: 代理类
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/24/18:34
 */
@Slf4j
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        log.info("ProxyImage:display");
        //TODO 代理类除了调用真实类以外,还做一些其他的处理
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
