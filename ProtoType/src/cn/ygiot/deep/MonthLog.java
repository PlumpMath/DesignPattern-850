package cn.ygiot.deep;


/**
 * 2016/4/28 15:09
 */
public class MonthLog implements Cloneable{
    private String name;
    private String date;
    private String content;
    private Attachment attachment;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    @Override
    protected MonthLog clone() {
        Object obj = null;
        try {
            MonthLog m = (MonthLog) super.clone();
            m.setAttachment(attachment.clone());
            return m;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "MonthLog{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                ", attachment=" + attachment +"  "+attachment.getName()+
                '}';
    }
}
