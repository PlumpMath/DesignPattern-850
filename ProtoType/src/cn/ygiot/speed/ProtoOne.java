package cn.ygiot.speed;

import java.io.*;

/**
 * 2016/4/28 16:57
 */
public class ProtoOne implements Cloneable,Serializable{
  private A a;
    private int id;
    private int money;

    public ProtoOne() {
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public ProtoOne(int id, int money) {
        this.id = id;
        this.money = money;
    }
    public ProtoOne(int id, int money,A a) {
        this.id = id;
        this.money = money;
        this.a = a;
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
    protected ProtoOne clone() {
        try {
            ProtoOne protoOne = (ProtoOne)super.clone();
            protoOne.setA(a.clone());
            return protoOne;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
