package cn.ygiot.dip2;

/**
 * 2016/4/22 7:14
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.cook(new Noodle());
        person.cook(new Rice());
    }
}
