package com.aisino.designpattern.factorypattern;

import javax.swing.*;

/**
 * @author: xuguangwu
 * @Description:
 * @date Created in 2020-10-29-下午 4:21
 */
public class ShapeFactory extends Circle{
//    public static PaoChe createPaoChe();
//    public static YueYeChe createYueYeChe();
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}
