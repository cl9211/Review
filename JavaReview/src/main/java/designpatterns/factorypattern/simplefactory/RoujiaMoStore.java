package designpatterns.factorypattern.simplefactory;

/**
 * Created by CHULEI on 2020/9/9.
 */

class RoujiaMoStore {

    private SimpleRouJiaMoFactory factory;

    public RoujiaMoStore(SimpleRouJiaMoFactory factory) {
        this.factory = factory;
    }

    /**
     * 根据传入类型卖不同的肉夹馍
     */
    public RouJiaMo sellRouJiaMo(String type) {
        RouJiaMo rouJiaMo = factory.createRouJiaMo(type);
        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }
}
