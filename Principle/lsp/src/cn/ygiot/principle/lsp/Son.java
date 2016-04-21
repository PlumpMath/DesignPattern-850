package cn.ygiot.principle.lsp;

import java.util.LinkedHashMap;

/**
 * 2016/4/21 22:27
 */
public class Son extends Father {
    public void say(LinkedHashMap map){
        System.out.println("子类执行..."+map.size());
    }
}
