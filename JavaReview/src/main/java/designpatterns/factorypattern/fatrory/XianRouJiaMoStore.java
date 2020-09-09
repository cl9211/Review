package designpatterns.factorypattern.fatrory;

/**
 * Created by CHULEI on 2020/9/9.
 */

class XianRouJiaMoStore extends RouJiaMoStore {
    @Override
    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;
        if ("Suan".equals(type)) {
            rouJiaMo = new XianSuanRouJiaMo();
        } else if ("La".equals(type)) {
            rouJiaMo = new XianLaRouJiaMo();
        }

        return rouJiaMo;
    }
}
