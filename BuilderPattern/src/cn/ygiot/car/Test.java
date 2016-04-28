package cn.ygiot.car;

/**
 * 2016/4/28 7:22
 */
public class Test {
    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector();
        //Jeep
        CarBuilder jeepBuilder = new JeepBuilder();
        carDirector.makeCar(jeepBuilder);
        Car jeepCar = jeepBuilder.getCar();
        System.out.println(jeepCar.getHead());
        System.out.println(jeepCar.getBody());
        System.out.println(jeepCar.getTail());
        //QQ
        CarBuilder qqBuilder = new QQBuilder();
        carDirector.makeCar(qqBuilder);
        Car qqCar = qqBuilder.getCar();
        System.out.println(qqCar.getHead());
        System.out.println(qqCar.getBody());
        System.out.println(qqCar.getTail());
    }
}
