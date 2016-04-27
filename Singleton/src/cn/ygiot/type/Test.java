package cn.ygiot.type;

/**
 * 2016/4/27 16:51
 */
public class Test {
    public static void main(String[] args) {
        //System.out.println(Singleton.getInstance());
        //System.out.println(Singleton.getInstance());
        //System.out.println(Singleton.getInstance());

        //new SynTest().start();
        //new SynTest().start();
        //new SynTest().start();
        //new SynTest().start();
        //new SynTest().start();

        //EnumSingleton e1 = EnumSingleton.instance;
        //EnumSingleton e2 = EnumSingleton.getInstance();
        //System.out.println(e1.hashCode());
        //System.out.println(e2.hashCode());

        System.out.println(InnerSingleton.getInstance());
        System.out.println(InnerSingleton.getInstance());
        System.out.println(InnerSingleton.getInstance());
        System.out.println(InnerSingleton.getInstance());
        System.out.println(InnerSingleton.getInstance());
    }
}
