package designpatterns.singletonpatterns;

import designpatterns.singletonpatterns.doublecheck.Singleton;

/**
 * Created by CHULEI on 2020/9/10.
 */

class Test {
    public static void main(String[] args) {
        // 饿汉式
//        Singleton.getInstance().singletonPrint();

        // 懒汉式
//        designpatterns.singletonpatterns.lh.Singleton.getInstance().singletonPrint();

        // Double Check
        Singleton.getInstance().singletonPrint();
    }
}
