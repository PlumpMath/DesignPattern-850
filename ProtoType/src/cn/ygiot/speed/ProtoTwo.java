package cn.ygiot.speed;

import java.io.*;

/**
 * 2016/4/28 16:57
 */
public class ProtoTwo implements Cloneable,Serializable{
    private int id;
    private int money;

    public ProtoTwo() {
    }


    public ProtoTwo(int id, int money) {
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
    protected ProtoTwo clone() {
        Object obj = null;
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            ObjectOutputStream oout = new ObjectOutputStream(bout);
            oout.writeObject(this);
            ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bin);
            return (ProtoTwo) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
