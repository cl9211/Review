package designpatterns.singletonpattern;

/**
 * Created by CHULEI on 2020/9/10.
 */

public enum SingleEnum {
    INSTANCE;

    public void singletonPrint() {
        System.out.println("枚举单例");
    }
}
