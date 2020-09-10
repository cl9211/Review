package designpatterns.factorypattern.abstractfactory;

/**
 * Created by CHULEI on 2020/9/10.
 */

class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }

        return null;
    }
}
