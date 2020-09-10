package designpatterns.buildpatterns;

/**
 * Created by CHULEI on 2020/9/10.
 */

class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
