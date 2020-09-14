package designpatterns.bridgepattern;

/**
 * Created by CHULEI on 2020/9/11.
 */

class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]L");
    }
}
