package designpatterns.factorypattern.abstractfactory;

/**
 * Created by CHULEI on 2020/9/10.
 */

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
