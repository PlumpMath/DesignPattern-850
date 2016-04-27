package cn.ygiot.type;

/**
 * 2016/4/27 19:18
 */
public class InnerSingleton {
    private InnerSingleton(){}
    private static class ClassHolder{
        private static InnerSingleton instance = new InnerSingleton();
    }
    public static InnerSingleton getInstance(){
        return ClassHolder.instance;
    }
}
