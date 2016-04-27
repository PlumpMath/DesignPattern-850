package cn.ygiot.type;

/**
 * 2016/4/27 18:41
 */
public enum EnumSingleton {
    instance;
    private EnumSingleton(){}
    public static EnumSingleton getInstance(){
        return instance;
    }
    public static void otherMethod(){
        System.out.println("otherMethod...");
    }
}
