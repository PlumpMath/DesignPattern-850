package cn.ygiot.deep1;

/**
 * 2016/4/28 15:12
 */
public class Test {
    public static void main(String[] args) {
        MonthLog preLog = new MonthLog();
        Attachment attachment = new Attachment();
        attachment.setName("附件1");
        preLog.setAttachment(attachment);
        preLog.setName("张老师");
        preLog.setDate("11月");
        preLog.setContent("这个月很忙，每天加班");
        System.out.println(preLog);
        MonthLog newLog = preLog.clone();
        newLog.setDate("12月");
        System.out.println(newLog);
    }
}
