package cn.ygiot.phone;

/**
 * 2016/4/26 9:39
 */
public class RedMiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("红米打电话...");
    }

    @Override
    public void message() {
        System.out.println("红米发短息...");
    }
}
