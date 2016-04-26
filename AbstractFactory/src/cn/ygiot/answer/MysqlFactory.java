package cn.ygiot.answer;

import cn.ygiot.problem.DatabaseInfo;
import cn.ygiot.problem.MysqlInfo;

import java.sql.Connection;

/**
 * 2016/4/26 15:27
 */
public class MysqlFactory implements DatabaseFactory {
    @Override
    public Connection createConnection() {
        return null;
    }

    @Override
    public DatabaseInfo createDatabaseInfo() {
        MysqlInfo info = new MysqlInfo();
        info.setCompany("oracle");
        info.setDatabaseName("mysql");
        info.setMoney(0);
        return info;
    }
}
