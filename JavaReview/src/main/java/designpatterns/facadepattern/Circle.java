package designpatterns.facadepattern;

/**
 * Created by CHULEI on 2020/9/15.
 */

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
