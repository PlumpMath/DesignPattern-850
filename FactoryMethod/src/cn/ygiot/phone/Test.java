package cn.ygiot.phone;

/**
 * 2016/4/26 9:40
 */
public class Test {
    public static void main(String[] args) {
        PhoneFactory mi5Factory = new Mi5Factory();
        mi5Factory.createPhone();
        PhoneFactory redMiFacotory = new RedMiFactory();
        redMiFacotory.createPhone();
    }
}
