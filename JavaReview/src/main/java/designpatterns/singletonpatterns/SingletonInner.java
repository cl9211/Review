package designpatterns.singletonpatterns;

/**
 * Created by CHULEI on 2020/9/10.
 */

public class SingletonInner {

    private SingletonInner() {
    }


    private static class SingletonInnerHolder {
        private static final SingletonInner INSTANCE = new SingletonInner();
    }

    public static final SingletonInner getInstance() {
        return SingletonInnerHolder.INSTANCE;
    }

    public void singletonPrint() {
        System.out.println("静态内部类单例");
    }
}
