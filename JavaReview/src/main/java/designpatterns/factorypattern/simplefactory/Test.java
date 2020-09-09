package designpatterns.factorypattern.simplefactory;

/**
 * Created by CHULEI on 2020/9/9.
 */

class Test {
    public static void main(String[] args) {
        RoujiaMoStore roujiaMoStore = new RoujiaMoStore(new SimpleRouJiaMoFactory());
        roujiaMoStore.sellRouJiaMo("La");
    }
}
