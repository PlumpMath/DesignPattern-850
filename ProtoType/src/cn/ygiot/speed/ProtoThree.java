package cn.ygiot.speed;

import java.io.*;

/**
 * 2016/4/28 16:57
 */
public class ProtoThree implements Cloneable,Serializable{
    private int id;
    private int money;

    public ProtoThree() {
    }


    public ProtoThree(int id, int money) {
        this.id = id;
        this.money = money;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    protected ProtoThree clone() throws CloneNotSupportedException {
        return (ProtoThree) super.clone();
    }

}
