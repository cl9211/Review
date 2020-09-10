package designpatterns.prototypepattern;

/**
 * Created by CHULEI on 2020/9/10.
 */

class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
