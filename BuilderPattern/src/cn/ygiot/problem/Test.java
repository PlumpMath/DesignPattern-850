package cn.ygiot.problem;

/**
 * 2016/4/28 9:32
 */
public class Test {
    public static void main(String[] args) {
        Head head = new Head();
        head.setSize("小脑袋");

        Body body = new Body();
        body.setSize("苗条身材");

        Foot foot = new Foot();
        foot.setSize("大脚");

        Weapon weapon = new Weapon();
        weapon.setColor("红色");
        weapon.setHuge("100点杀伤力");

        Person person = new Person();
        person.setHead(head);
        person.setBody(body);
        person.setFoot(foot);
        person.setWeapon(weapon);

        System.out.println(person);
    }
}
