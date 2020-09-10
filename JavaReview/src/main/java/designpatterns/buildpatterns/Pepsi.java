package designpatterns.buildpatterns;

/**
 * Created by CHULEI on 2020/9/10.
 */

class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
