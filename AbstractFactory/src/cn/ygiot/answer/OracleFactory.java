package cn.ygiot.answer;

import cn.ygiot.problem.DatabaseInfo;
import cn.ygiot.problem.OracleInfo;

import java.sql.Connection;

/**
 * 2016/4/26 15:28
 */
public class OracleFactory implements DatabaseFactory {
    @Override
    public Connection createConnection() {
        return null;
    }

    @Override
    public DatabaseInfo createDatabaseInfo() {
        OracleInfo info = new OracleInfo();
        info.setCompany("oracle");
        info.setDatabaseName("oracle");
        info.setMoney(200000);
        return info;
    }
}
