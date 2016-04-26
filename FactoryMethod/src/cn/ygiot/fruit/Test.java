package cn.ygiot.fruit;

/**
 * 2016/4/26 12:39
 */
public class Test {
    public static void main(String[] args) {
        FruitFactory appleFactory = new AppleFactory();
        FruitFactory bananaFactory = new BananaFactory();
        FruitFactory pearFactory = new PearFactory();
        Fruit apple = appleFactory.createFruit();
        Fruit banana = bananaFactory.createFruit();
        Fruit pear = pearFactory.createFruit();
    }
}
