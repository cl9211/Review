package designpatterns.commandpattern;

/**
 * Created by CHULEI on 2020/9/16.
 */

class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
