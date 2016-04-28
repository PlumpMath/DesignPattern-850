package cn.ygiot.problem;

/**
 * 2016/4/28 9:24
 */
public class Person {
    private String name;
    private Head head;
    private Body body;
    private Foot foot;
    private Weapon weapon;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Foot getFoot() {
        return foot;
    }

    public void setFoot(Foot foot) {
        this.foot = foot;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name +
                " [head=" + head +
                ", body=" + body +
                ", foot=" + foot +
                ", weapon=" + weapon
                +"]";
    }
}
