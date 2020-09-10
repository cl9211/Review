package designpatterns.factorypattern.abstractfactory;

/**
 * Created by CHULEI on 2020/9/10.
 */

class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {

        if (color != null && !color.isEmpty()) {
            if (color.equalsIgnoreCase("red")) {
                return new Red();
            } else if (color.equalsIgnoreCase("green")) {
                return new Green();
            } else if (color.equalsIgnoreCase("blue")) {
                return new Blue();
            }
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
