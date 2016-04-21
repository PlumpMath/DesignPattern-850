package cn.ygiot.principle.lsp;

import java.util.LinkedHashMap;

/**
 * 2016/4/21 22:28
 */
public class Test {
    public static void main(String[] args) {
        LinkedHashMap hashMap = new LinkedHashMap();
        Father father = new Father();
        father.say(hashMap);
        Son son = new Son();
        son.say(hashMap);
    }
}
