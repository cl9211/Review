package designpatterns.factorypattern.abstractfactory;


/**
 * Created by CHULEI on 2020/9/9.
 */

class XianRouJiaMoTeSeStore extends RouJiaMoStore {

    private XianSimpleRouJiaMoTeSeFactory factory;

    public XianRouJiaMoTeSeStore(XianSimpleRouJiaMoTeSeFactory factory) {
        this.factory = factory;
    }

    @Override
    public RouJiaMo sellRouJiaMo(String type) {
        RouJiaMo rouJiaMo = factory.createRouJiaMo(type);
        rouJiaMo.prepare(new XianRouJiaMoYLFactory());
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }
}
