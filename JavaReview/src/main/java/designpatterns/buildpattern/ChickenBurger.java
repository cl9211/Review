package designpatterns.buildpattern;

/**
 * Created by CHULEI on 2020/9/10.
 */

class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
