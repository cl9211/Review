package designpatterns.factorypattern.abstractfactory;

/**
 * Created by CHULEI on 2020/9/9.
 */

class XianSimpleRouJiaMoTeSeFactory {
    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;
        switch (type) {
            case "Suan":
                rouJiaMo = new XianSuanRouJiaMo();
                break;
        }
        return rouJiaMo;
    }
}
