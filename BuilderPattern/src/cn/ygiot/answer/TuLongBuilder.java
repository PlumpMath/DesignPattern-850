package cn.ygiot.answer;

import cn.ygiot.problem.*;

/**
 * 2016/4/28 10:47
 */
public class TuLongBuilder implements  PersonBuilder {
    private Person person = new Person();

    @Override
    public void buildName() {
        person.setName("屠龙");
    }

    @Override
    public void buildHead() {
        Head head = new Head();
        head.setSize("圆脑袋 大眼睛 长胡子");
        person.setHead(head);
    }

    @Override
    public void buildBody() {
        Body body = new Body();
        body.setSize("身子很壮");
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
        weapon.setColor("黑");
        weapon.setHuge("屠龙刀杀伤1000点...");
        person.setWeapon(weapon);
    }

    @Override
    public Person getPerson() {
        return person;
    }
}
