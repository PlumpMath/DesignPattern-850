package cn.ygiot.answer;

import cn.ygiot.problem.DatabaseInfo;

import java.sql.Connection;

/**
 * 2016/4/26 15:32
 */
public class Worker {
    private DatabaseInfo databaseInfo;
    private Connection connection;

    public Worker(DatabaseFactory databaseFactory) {
        this.databaseInfo = databaseFactory.createDatabaseInfo();
        this.connection = databaseFactory.createConnection();
    }
    public void doWork(){
        System.out.println("数据库连接"+connection);
        System.out.println("数据库:"+databaseInfo.getDatabaseName()+" 所属公司:"+databaseInfo.getCompany()+" 费用:"+databaseInfo.getMoney());
    }
}
