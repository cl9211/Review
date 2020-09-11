package designpatterns.bridgepatterns;

/**
 * Created by CHULEI on 2020/9/11.
 */

class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]L");
    }
}
