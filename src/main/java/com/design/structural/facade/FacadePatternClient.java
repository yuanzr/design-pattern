package com.design.structural.facade;

/**
 * @ClassName: FacadePatternClient
 * @Description: TODO
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/24/18:27
 */
public class FacadePatternClient {
    public static void main(String[] args) {
        FacedeService shapeMaker = new FacedeService();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
