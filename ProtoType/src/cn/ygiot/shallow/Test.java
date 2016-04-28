package cn.ygiot.shallow;

/**
 * 2016/4/28 15:12
 */
public class Test {
    public static void main(String[] args) {
        MonthLog preLog = new MonthLog();
        Attachment attachment = new Attachment();
        attachment.setName("附件");
        preLog.setAttachment(attachment);
        preLog.setName("张老师");
        preLog.setDate("11月");
        preLog.setContent("这个月很忙，忙的月报内容也没时间改了...");
        System.out.println(preLog);
        MonthLog newLog = preLog.clone();
        newLog.setDate("12月");
        System.out.println(newLog);
    }
}
