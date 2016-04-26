package cn.ygiot.phone;

/**
 * 2016/4/26 9:39
 */
public class RedMiPhone implements Phone {
    private String screen;
    private String battery;
    @Override
    public void call() {
        System.out.println("红米打电话...");
    }

    @Override
    public void message() {
        System.out.println("红米发短息...");
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
