package designpatterns.observerpattern.observer2;

import java.util.Observable;

/**
 * Created by CHULEI on 2020/9/9.
 */

class SubjectForSSQ extends Observable {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}
