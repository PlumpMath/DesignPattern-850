package cn.ygiot.phone;

/**
 * 2016/4/26 9:37
 */
public class RedMiFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        RedMiPhone mi = new RedMiPhone();
        mi.setBattery("3000毫安电池");
        mi.setScreen("1080p屏");
        System.out.println("RedMiFactory生产红米 "+mi.getBattery()+"  "+mi.getScreen());
        return mi;
    }
}
