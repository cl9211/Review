package designpatterns.factorypattern.fatrory;

/**
 * Created by CHULEI on 2020/9/10.
 */

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
