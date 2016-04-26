package cn.ygiot.phone;

/**
 * 2016/4/26 9:37
 */
public class PhoneFactory {
    public static final int MI5 = 0;
    public static final int RED_MI=1;
    public static Phone createPhone(int type){
        switch (type){
            case MI5:
                return new Mi5Phone();
            case RED_MI:
                return new RedMiPhone();
            default:
                return null;
        }
    }
}
