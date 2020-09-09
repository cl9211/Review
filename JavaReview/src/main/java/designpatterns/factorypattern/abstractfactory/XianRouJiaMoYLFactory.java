package designpatterns.factorypattern.abstractfactory;

/**
 * Created by CHULEI on 2020/9/9.
 */

class XianRouJiaMoYLFactory implements RouJiaMoYLFactory {
    @Override
    public Meat createMeat() {
        return new XianFreshMeat();
    }

    @Override
    public YuanLiao createYuanLiao() {
        return new XianTeSeYuanLiao();
    }
}
