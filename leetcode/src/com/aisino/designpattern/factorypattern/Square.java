package com.aisino.designpattern.factorypattern;

/**
 * @author: xuguangwu
 * @Description:
 * @date Created in 2020-10-29-下午 4:30
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square draw");
    }
}
