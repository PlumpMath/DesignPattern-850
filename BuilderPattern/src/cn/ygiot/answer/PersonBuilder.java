package cn.ygiot.answer;

import cn.ygiot.problem.Person;

/**
 * 2016/4/28 10:21
 */
public interface PersonBuilder {
    void buildName();
    void buildHead();
    void buildBody();
    void buildFoot();
    void buildWeapon();
    Person getPerson();
}
