package cn.ygiot.phone;

/**
 * 2016/4/26 9:37
 */
public class Mi5Factory implements PhoneFactory {

    @Override
    public Phone createPhone() {
        Mi5Phone mi = new Mi5Phone();
        mi.setBattery("5000毫安电池");
        mi.setScreen("4K大屏");
        System.out.println("Mi5Factory生产Mi5"+mi.getBattery()+"  "+mi.getScreen());
        return mi;
    }
}
