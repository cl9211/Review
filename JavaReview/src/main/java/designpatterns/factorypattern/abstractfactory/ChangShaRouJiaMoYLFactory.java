package designpatterns.factorypattern.abstractfactory;

/**
 * Created by CHULEI on 2020/9/9.
 */

class ChangShaRouJiaMoYLFactory implements RouJiaMoYLFactory {
    @Override
    public Meat createMeat() {
        return new ChangShaFreshMeat();
    }

    @Override
    public YuanLiao createYuanLiao() {
        return new ChangShaTeSeYL();
    }
}
