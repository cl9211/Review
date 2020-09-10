package designpatterns.buildpatterns;

/**
 * Created by CHULEI on 2020/9/10.
 */

class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
