package cn.ygiot.isp2;

/**
 * 2016/4/22 7:38
 */
public class PrettyGirl implements IGreatTemperament {
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
    public void greatTemperament() {
        System.out.println(name+"气质佳...");
    }
}
