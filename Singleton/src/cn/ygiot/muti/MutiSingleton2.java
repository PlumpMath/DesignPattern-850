package cn.ygiot.muti;

import java.util.HashMap;
import java.util.Map;

/**
 * 2016/4/27 18:56
 */
public class MutiSingleton2 {
    private MutiSingleton2() {
    }
    public static Map<Integer, MutiSingleton2> map = new HashMap<>();
    private static int number = 1;//默认第一个key
    private static final int TOTLE_NUMBER = 3;//总的实例个数
    public static MutiSingleton2 getInstance() {
        MutiSingleton2 instance = map.get(number);
        if (instance == null) {
            instance = new MutiSingleton2();
            map.put(number, instance);
        }
        number++;
        if (number > TOTLE_NUMBER) {
            number = 1;
        }
        return instance;
    }
}
