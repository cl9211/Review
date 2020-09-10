package designpatterns.factorypattern.abstractfactory;

/**
 * Created by CHULEI on 2020/9/9.
 */

class Test {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("shape");
        abstractFactory.getShape("circle").draw();
    }
}
