package cn.ygiot.type;

/**
 * 2016/4/27 17:02
 */
public class SynTest extends Thread {
    @Override
    public void run() {
        System.out.println(LockSingleton.getInstance());
    }
}
