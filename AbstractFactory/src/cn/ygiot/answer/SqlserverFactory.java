package cn.ygiot.answer;

import cn.ygiot.problem.DatabaseInfo;
import cn.ygiot.problem.SqlserverInfo;

import java.sql.Connection;

/**
 * 2016/4/26 15:28
 */
public class SqlserverFactory implements DatabaseFactory {
    @Override
    public Connection createConnection() {
        return null;
    }

    @Override
    public DatabaseInfo createDatabaseInfo() {
        SqlserverInfo info = new SqlserverInfo();
        info.setCompany("Microsoft");
        info.setDatabaseName("SqlServer");
        info.setMoney(100000);
        return info;
    }
}
