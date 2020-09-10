package designpatterns.singletonpatterns.doublecheck;

/**
 * Created by CHULEI on 2020/9/10.
 */

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    public void singletonPrint() {
        System.out.println("Double Check");
    }
}
