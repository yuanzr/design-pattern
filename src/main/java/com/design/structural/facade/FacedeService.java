package com.design.structural.facade;

/**
 * @ClassName: FacedeService
 * @Description: TODO
 * @Author: YuanZhenRong
 * @Version: 1.0.0
 * @CreateDate: 2019/12/24/18:26
 */
public class FacedeService {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public FacedeService() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
