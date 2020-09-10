package designpatterns.singletonpatterns;

/**
 * Created by CHULEI on 2020/9/10.
 */

public class SingletonDcl {

    private static volatile SingletonDcl instance;

    private SingletonDcl() {
    }

    public static SingletonDcl getInstance() {
        if (instance == null) {
            synchronized (SingletonDcl.class) {
                if (instance == null) {
                    instance = new SingletonDcl();
                }
            }
        }
        return instance;
    }

    public void singletonPrint() {
        System.out.println("DCL单例");
    }

}
