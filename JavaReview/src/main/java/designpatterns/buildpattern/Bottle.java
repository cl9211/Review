package designpatterns.buildpattern;

/**
 * Created by CHULEI on 2020/9/10.
 */

class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
