package designpatterns.singletonpattern;

/**
 * Created by CHULEI on 2020/9/10.
 */

public class SingletonEh {
    private static SingletonEh instance = new SingletonEh();

    private SingletonEh() {
    }

    public static SingletonEh getInstance() {
        return instance;
    }

    public void singletonPrint() {
        System.out.println("饿汉单例");
    }

}
