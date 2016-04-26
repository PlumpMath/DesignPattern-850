package cn.ygiot.fruit;

/**
 * 2016/4/26 12:34
 */
public class AppleFactory implements FruitFactory {
    @Override
    public Fruit createFruit() {
        System.out.println("AppleFactory 成产 Apple");
        return new Apple();
    }
}
