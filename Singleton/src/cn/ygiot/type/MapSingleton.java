package cn.ygiot.type;

import java.util.HashMap;
import java.util.Map;

/**
 * 2016/4/27 18:48
 */
public class MapSingleton {
    public static final String DEFAULT_KEY = "instance_key";
    private MapSingleton(){}
    private static Map<String,MapSingleton> map = new HashMap<>();
    public static MapSingleton getInstance(){
        MapSingleton instance = map.get(DEFAULT_KEY);
        if(instance==null){
            instance = map.put(DEFAULT_KEY,new MapSingleton());
        }
        return instance;
    }
}
