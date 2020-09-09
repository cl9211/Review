package designpatterns.observerpattern.observer1;

/**
 * Created by CHULEI on 2020/9/8.
 */

class Test {
    public static void main(String[] args) {
        ObjectFor3D subjectFor3D = new ObjectFor3D();
        // 客户1
        Observer observer1 = new Observer1(subjectFor3D);
        Observer observer2 = new Observer2(subjectFor3D);

        subjectFor3D.setMsg("20140420 3D号码是：127");
        subjectFor3D.setMsg("20140421 3D号码是：333");
    }
}
