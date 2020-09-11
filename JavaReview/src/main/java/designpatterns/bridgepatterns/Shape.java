package designpatterns.bridgepatterns;

/**
 * Created by CHULEI on 2020/9/11.
 */

abstract class Shape {
    protected DrawApi drawApi;
    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
