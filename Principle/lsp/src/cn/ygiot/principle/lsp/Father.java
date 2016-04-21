package cn.ygiot.principle.lsp;

import java.util.HashMap;

/**
 * 2016/4/21 22:26
 */
public class Father {
    public void say(HashMap map){
        System.out.println("父类执行..."+map.size());
    }
}
