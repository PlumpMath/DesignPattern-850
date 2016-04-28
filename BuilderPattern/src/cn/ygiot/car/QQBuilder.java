package cn.ygiot.car;

/**
 * 2016/4/28 7:20
 */
public class QQBuilder extends CarBuilder {
    private Car car  = new Car();
    @Override
    public void makeHead() {
        car.setHead("QQ Head");
    }

    @Override
    public void makeBody() {
        car.setBody("QQ Body");
    }

    @Override
    public void makeTail() {
        car .setTail("QQ Tail");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
