package cn.ygiot.deep;

/**
 * 2016/4/28 15:20
 */
public class Attachment implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Attachment clone() {
        try {
            Attachment attachment = (Attachment)super.clone();
            return attachment;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
