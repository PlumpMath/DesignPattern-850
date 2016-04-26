package cn.ygiot.fruit;

/**
 * 2016/4/26 12:34
 */
public class PearFactory implements FruitFactory {
    @Override
    public Fruit createFruit() {
        System.out.println("PearFactory 成产 Pear");
        return new Pear();
    }
}
