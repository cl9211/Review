package designpatterns.facadepattern;

/**
 * Created by CHULEI on 2020/9/15.
 */

class Test {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
