package designpatterns.singletonpatterns;

/**
 * Created by CHULEI on 2020/9/10.
 */

class Test {
    public static void main(String[] args) {
        // 枚举单例
        SingleEnum.INSTANCE.singletonPrint();

        // dcl单例
        SingletonDcl.getInstance().singletonPrint();

        // 饿汉单例
        SingletonEh.getInstance().singletonPrint();

        // 静态内部类单例
        SingletonInner.getInstance().singletonPrint();

        // 懒汉单例
        SingletonLh.getInstance().singletonPrint();
    }
}
