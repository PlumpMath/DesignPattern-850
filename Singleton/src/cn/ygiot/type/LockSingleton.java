package cn.ygiot.type;

/**
 * 2016/4/27 17:07
 */
public class LockSingleton {
    private LockSingleton(){}
    private static LockSingleton instance;
    public static LockSingleton getInstance(){
        if(instance==null){
            synchronized (LockSingleton.class){
                if(instance==null){
                    instance = new LockSingleton();
                }
            }
        }
        return instance;
    }
}
