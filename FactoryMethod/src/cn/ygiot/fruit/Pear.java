package cn.ygiot.fruit;

/**
 * 2016/4/26 12:30
 */
public class Pear implements Fruit {

    @Override
    public void plan() {
        System.out.println("梨种植...");
    }

    @Override
    public void grow() {
        System.out.println("梨生长...");
    }
}
