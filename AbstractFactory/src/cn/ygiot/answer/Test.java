package cn.ygiot.answer;

/**
 * 2016/4/26 15:28
 */
public class Test {
    public static void main(String[] args) {
        DatabaseFactory df = new MysqlFactory();
        DatabaseFactory df1 = new OracleFactory();
        DatabaseFactory df2 = new SqlserverFactory();
        Worker workerA = new Worker(df);
        workerA.doWork();
        Worker workerB = new Worker(df1);
        workerB.doWork();
        Worker workerC = new Worker(df2);
        workerC.doWork();
    }
}
