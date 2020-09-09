package designpatterns.factorypattern.abstractfactory;

/**
 * Created by CHULEI on 2020/9/9.
 */

interface RouJiaMoYLFactory {
    /**
     * 生产肉
     */
    public Meat createMeat();

    /**
     * 生产调料
     */
    public YuanLiao createYuanLiao();
}
