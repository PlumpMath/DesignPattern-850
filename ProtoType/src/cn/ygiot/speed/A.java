package cn.ygiot.speed;

import java.io.Serializable;

/**
 * 2016/4/28 17:31
 */
public class A implements Cloneable,Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected A clone() throws CloneNotSupportedException {
        return (A) super.clone();
    }
}
