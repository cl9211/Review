package designpatterns.buildpattern;

/**
 * Created by CHULEI on 2020/9/10.
 */

abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
