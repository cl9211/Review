package designpatterns.singletonpattern;

/**
 * Created by CHULEI on 2020/9/10.
 */

public class SingletonLh {

    private static SingletonLh instance = null;

    private SingletonLh() {
    }

    public static SingletonLh getInstance() {
        if (instance == null) {
            instance = new SingletonLh();
        }

        return instance;
    }

    public void singletonPrint() {
        System.out.println("懒汉单例");
    }

}
