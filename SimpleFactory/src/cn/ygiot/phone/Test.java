package cn.ygiot.phone;

/**
 * 2016/4/26 9:40
 */
public class Test {
    public static void main(String[] args) {
        Phone mi5 = PhoneFactory.createPhone(PhoneFactory.MI5);
        mi5.call();
        mi5.message();
        Phone redMi = PhoneFactory.createPhone(PhoneFactory.RED_MI);
        redMi.call();
        redMi.message();
    }
}
