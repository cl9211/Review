package designpatterns.proxypattern;

/**
 * Created by CHULEI on 2020/9/15.
 */

class Test {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();

    }
}
