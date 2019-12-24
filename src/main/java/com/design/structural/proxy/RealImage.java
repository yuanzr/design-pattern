package com.design.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName: RealImage
 * @Description: 真实的图片
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/24/18:32
 */
@Slf4j
public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        log.info("RealImage:{} " ,fileName);
    }

    private void loadFromDisk(String fileName){
        log.info("Loading " + fileName);
    }
}
