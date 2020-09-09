package designpatterns.observerpattern.observer1;

/**
 * Created by CHULEI on 2020/9/8.
 */

class Observer1 implements Observer {
    private Subject subject;

    public Observer1(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("observer1的3D号码： " + msg + " 我要记下来");
    }
}
