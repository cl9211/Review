package designpatterns.singletonpatterns.eh;

/**
 * Created by CHULEI on 2020/9/10.
 */

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void singletonPrint() {
        System.out.println("饿汉式");
    }
}
