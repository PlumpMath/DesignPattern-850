package cn.ygiot.problem;

/**
 * 2016/4/28 9:30
 */
public class Weapon {
    private String huge;
    private String color;

    public String getHuge() {
        return huge;
    }

    public void setHuge(String huge) {
        this.huge = huge;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return color+"色武器，"+huge;
    }
}
