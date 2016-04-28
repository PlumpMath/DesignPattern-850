package cn.ygiot.answer;

import cn.ygiot.problem.Person;

/**
 * 2016/4/28 10:31
 */
public class Director {
    private PersonBuilder personBuilder;
    public Director(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }
    public Person buildPerson(){
        personBuilder.buildName();
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildFoot();
        personBuilder.buildWeapon();
        return personBuilder.getPerson();
    }
}
