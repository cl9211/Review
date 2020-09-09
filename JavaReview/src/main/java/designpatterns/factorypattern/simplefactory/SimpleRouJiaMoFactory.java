package designpatterns.factorypattern.simplefactory;

/**
 * Created by CHULEI on 2020/9/9.
 */

class SimpleRouJiaMoFactory {
    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;

        if ("Suan".equals(type)) {
            rouJiaMo = new SuanRouJiaMo();
        } else if ("La".equals(type)) {
            rouJiaMo = new LaRouJiaMo();
        }

        return rouJiaMo;
    }
}
