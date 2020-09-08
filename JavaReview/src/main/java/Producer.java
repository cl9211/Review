import java.util.ArrayList;
import java.util.List;

/**
 * Created by CHULEI on 2020/8/31.
 */

class Producer extends Thread {
    List<Message> msgList = new ArrayList<>();

    @Override
    public void run() {
        super.run();
        try {
            while (true) {
                Thread.sleep(3000);
                Message msg = new Message();
                synchronized (msgList) {
                    msgList.add(msg);
                    msgList.notify();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Message waitMsg() {
        synchronized (msgList) {
            if (msgList.size() == 0) {
                try {
                    msgList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return msgList.remove(0);
        }
    }
}
