package cn.ygiot.log1;

/**
 * 2016/4/28 15:12
 */
public class Test {
    public static void main(String[] args) {
        MonthLog preLog = new MonthLog();
        preLog.setName("张老师");
        preLog.setDate("11月");
        preLog.setContent("这个月很忙，每天加班");
        System.out.println(preLog);
        //新的月报，直接克隆上个月的月报
        MonthLog newLog = preLog.clone();
        newLog.setDate("12月");
        System.out.println(newLog);
    }
}
