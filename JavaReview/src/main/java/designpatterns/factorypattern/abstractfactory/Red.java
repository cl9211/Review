package designpatterns.factorypattern.abstractfactory;

/**
 * Created by CHULEI on 2020/9/10.
 */

class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
