package designpatterns.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CHULEI on 2020/9/16.
 */

class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }

        orderList.clear();
    }
}
