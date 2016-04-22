package cn.ygiot.isp2;



/**
 * 2016/4/22 7:43
 */
public class Test {
    public static void main(String[] args) {
        Man man = new Man("小明");
        IGreatTemperament prettyGirl = new PrettyGirl("Teacher Cang");
        man.findGirl(prettyGirl);
    }
}
