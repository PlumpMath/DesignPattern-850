package cn.ygiot.car;

/**
 * 2016/4/28 7:21
 */
public class CarDirector {
    public void makeCar(CarBuilder carBuilder){
        carBuilder.makeHead();
        carBuilder.makeBody();
        carBuilder.makeTail();
    }
}
