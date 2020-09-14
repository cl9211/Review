package designpatterns.buildpattern;

/**
 * Created by CHULEI on 2020/9/10.
 */

abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
