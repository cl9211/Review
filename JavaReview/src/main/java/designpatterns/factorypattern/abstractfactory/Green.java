package designpatterns.factorypattern.abstractfactory;

/**
 * Created by CHULEI on 2020/9/10.
 */

class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
