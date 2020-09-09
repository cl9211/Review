package designpatterns.factorypattern.abstractfactory;

/**
 * Created by CHULEI on 2020/9/9.
 */

class Test {
    public static void main(String[] args) {
        XianRouJiaMoTeSeStore xianRouJiaMoTeSeStore = new XianRouJiaMoTeSeStore(new XianSimpleRouJiaMoTeSeFactory());
        xianRouJiaMoTeSeStore.sellRouJiaMo("Suan");
    }
}
