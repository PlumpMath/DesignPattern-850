package cn.ygiot.isp2;

/**
 * 2016/4/22 7:40
 */
public class Man {
    private String name;

    public Man() {
    }

    public Man(String name) {
        this.name = name;
    }

    public void findGirl(IGreatTemperament prettyGirl){
        System.out.println(name+"找到女朋友:");
        prettyGirl.greatTemperament();
    }
}
