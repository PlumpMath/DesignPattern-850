package cn.ygiot.type;

/**
 * 2016/4/27 16:48
 */
public class Singleton {
    private Singleton(){}
    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }
}
