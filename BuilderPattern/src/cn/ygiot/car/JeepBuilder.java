package cn.ygiot.car;

/**
 * 2016/4/28 7:20
 */
public class JeepBuilder extends CarBuilder {
    private Car car  = new Car();
    @Override
    public void makeHead() {
        car.setHead("Jeep Head");
    }

    @Override
    public void makeBody() {
        car.setBody("Jeep Body");
    }

    @Override
    public void makeTail() {
        car .setTail("Jeep Tail");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
