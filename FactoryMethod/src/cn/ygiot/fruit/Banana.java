package cn.ygiot.fruit;

/**
 * 2016/4/26 12:30
 */
public class Banana implements Fruit {
    @Override
    public void plan() {
        System.out.println("香蕉种植...");
    }
    @Override
    public void grow() {
        System.out.println("香蕉生长...");
    }
}
