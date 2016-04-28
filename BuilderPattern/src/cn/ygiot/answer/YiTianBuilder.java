package cn.ygiot.answer;

import cn.ygiot.problem.*;

/**
 * 2016/4/28 10:23
 */
public class YiTianBuilder implements PersonBuilder {
    private Person person = new Person();

    @Override
    public void buildName() {
        person.setName("倚天");
    }

    @Override
    public void buildHead() {
        Head head = new Head();
        head.setSize("大脑袋");
        person.setHead(head);
    }

    @Override
    public void buildBody() {
        Body body = new Body();
        body.setSize("小身子");
        person.setBody(body);
    }

    @Override
    public void buildFoot() {
        Foot foot = new Foot();
        foot.setSize("大脚掌");
        person.setFoot(foot);
    }

    @Override
    public void buildWeapon() {
        Weapon weapon = new Weapon();
        weapon.setColor("青");
        weapon.setHuge("倚天剑杀伤999点...");
        person.setWeapon(weapon);
    }

    @Override
    public Person getPerson() {
        return person;
    }
}
