package cn.ygiot.muti;

import java.util.HashMap;
import java.util.Map;

/**
 * 2016/4/27 18:56
 */
public class MutiSingleton {
    private MutiSingleton() {
    }
    public static Map<String, MutiSingleton> map = new HashMap<>();
    private static int number = 1;//默认第一个key
    private static final int TOTLE_NUMBER = 3;//总的实例个数
    private static final String DEFALUT_KEY = "key";
    public static MutiSingleton getInstance() {
        MutiSingleton instance = map.get(DEFALUT_KEY + number);
        if (instance == null) {
            instance = new MutiSingleton();
            map.put(DEFALUT_KEY + number, instance);
        }
        number++;
        if (number > TOTLE_NUMBER) {
            number = 1;
        }
        return instance;
    }
}
