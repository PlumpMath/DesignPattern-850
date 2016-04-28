package cn.ygiot.answer;

import cn.ygiot.problem.Person;

/**
 * 2016/4/28 10:40
 */
public class Test {
    public static void main(String[] args) {
        PersonBuilder tuLongBuilder = new TuLongBuilder();
        Director director = new Director(tuLongBuilder);
        Person tuLong = director.buildPerson();
        System.out.println(tuLong);
    }
}
