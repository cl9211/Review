package designpatterns.singletonpatterns.lh;

/**
 * Created by CHULEI on 2020/9/10.
 */

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void singletonPrint() {
        System.out.println("懒汉式");
    }
}
