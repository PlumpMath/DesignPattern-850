package cn.ygiot.type;

/**
 * 2016/4/27 16:54
 */
public class LazySingleton {
    private LazySingleton(){}
    private static LazySingleton instance;
    public static LazySingleton getInstance(){
        if(instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
