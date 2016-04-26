package cn.ygiot.phone;

/**
 * 2016/4/26 9:38
 */
public class Mi5Phone implements Phone {
    private String screen;
    private String battery;
    @Override
    public void call() {
        System.out.println("小米5打电话...");
    }

    @Override
    public void message() {
        System.out.println("小米5发短信...");
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
}
