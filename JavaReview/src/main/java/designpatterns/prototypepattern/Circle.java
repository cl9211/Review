package designpatterns.prototypepattern;

/**
 * Created by CHULEI on 2020/9/10.
 */

class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
