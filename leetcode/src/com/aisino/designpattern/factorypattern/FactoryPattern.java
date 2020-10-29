package com.aisino.designpattern.factorypattern;

/**
 * @author: xuguangwu
 * @Description:工厂模式：分三种-简单工厂模式、工厂方法模式、抽象工厂模式
 * 工厂方法提供了创建对象的最佳方法之一。
 * https://baijiahao.baidu.com/s?id=1654697401590676083&wfr=spider&for=pc
 * @date Created in 2020-10-29-上午 10:20
 */
public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();
    }
}
