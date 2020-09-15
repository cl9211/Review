package designpatterns.decoratorpattern;

/**
 * Created by CHULEI on 2020/9/15.
 */

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
