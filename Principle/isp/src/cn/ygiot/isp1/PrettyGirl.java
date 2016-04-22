package cn.ygiot.isp1;

/**
 * 2016/4/22 7:38
 */
public class PrettyGirl implements IPrettyGirl {
    private String name;
    public PrettyGirl() {
    }
    public PrettyGirl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void greatLooking() {
        System.out.println(name+"长相好...");
    }
    @Override
    public void greatFigure() {
        System.out.println(name+"身材好...");
    }
    @Override
    public void greatTemperament() {
        System.out.println(name+"气质佳...");
    }
}
