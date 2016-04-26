package cn.ygiot.phone;

/**
 * 2016/4/26 9:38
 */
public class Mi5Phone implements Phone {
    @Override
    public void call() {
        System.out.println("小米5打电话...");
    }

    @Override
    public void message() {
        System.out.println("小米5发短信...");
    }
}
