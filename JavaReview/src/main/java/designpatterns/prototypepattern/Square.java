package designpatterns.prototypepattern;

/**
 * Created by CHULEI on 2020/9/10.
 */

class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
