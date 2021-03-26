package com.codingdm.pattern.decorator;


import com.codingdm.pattern.decorator.imp.Circle;
import com.codingdm.pattern.decorator.imp.Rectangle;
import com.codingdm.pattern.decorator.imp.RedShapeDecorator;

/**
 * @author wudongming1
 * @email dongming1.wu@genscript.com
 * @Date 10/23/2020 3:10 PM
 **/
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircleShapeDecorator = new RedShapeDecorator(new Circle());
        Shape redRectangleShapeDecorator = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircleShapeDecorator.draw();

        System.out.println("\nRectangle of red border");
        redRectangleShapeDecorator.draw();
    }
}
