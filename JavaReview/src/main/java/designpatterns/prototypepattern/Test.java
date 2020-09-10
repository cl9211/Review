package designpatterns.prototypepattern;

/**
 * Created by CHULEI on 2020/9/10.
 */

class Test {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape1 = ShapeCache.getShape("1");
        System.out.println("Shape1: " + cloneShape1.getType());

        Shape cloneShape2 = ShapeCache.getShape("2");
        System.out.println("Shape2: " + cloneShape2.getType());

        Shape cloneShape3 = ShapeCache.getShape("3");
        System.out.println("Shape3: " + cloneShape3.getType());
    }
}
