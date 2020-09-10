package designpatterns.factorypattern.fatrory;

/**
 * Created by CHULEI on 2020/9/10.
 */

class Test {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();
    }
}
