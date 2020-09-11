package designpatterns.bridgepatterns;

/**
 * Created by CHULEI on 2020/9/11.
 */

class Test {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 100, 100, 10);
        Shape greenCircle = new Circle(new GreenCircle(), 100, 100, 10);

        redCircle.draw();
        greenCircle.draw();

    }
}
