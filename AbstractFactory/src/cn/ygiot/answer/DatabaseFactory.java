package cn.ygiot.answer;

import cn.ygiot.problem.DatabaseInfo;

import java.sql.Connection;

/**
 * 2016/4/26 15:26
 */
public interface DatabaseFactory {
    Connection createConnection();
    DatabaseInfo createDatabaseInfo();
}
