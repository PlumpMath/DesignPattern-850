package cn.ygiot.fruit;

/**
 * 2016/4/26 12:34
 */
public class BananaFactory implements FruitFactory {
    @Override
    public Fruit createFruit() {
        System.out.println("BananaFactory 成产 Banana");
        return new Banana();
    }
}
