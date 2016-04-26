package cn.ygiot.fruit;

/**
 * 2016/4/26 12:29
 */
public class Apple implements Fruit {
    @Override
    public void plan() {
        System.out.println("苹果种植...");
    }

    @Override
    public void grow() {
        System.out.println("苹果生长...");
    }

}
