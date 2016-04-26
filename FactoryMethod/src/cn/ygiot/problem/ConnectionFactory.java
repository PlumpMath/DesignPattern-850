package cn.ygiot.problem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 2016/4/22 10:35
 */
public class ConnectionFactory {
    private ConnectionFactory() {
    }
    public static final String MYSQL = "com.mysql.jdbc.Driver";
    public static final String ORACLE = "oracle.jdbc.driver.OracleDriver";
    public static final String SQLSERVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/music";
    private static final String ORACLE_URL = "jdbc:oracle:thin:@127.0.0.1:1521:simlink";
    private static final String SQLSERVER_URL = "jdbc:sqlserver://localhost:1433";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";
    public static Connection getConnection(String database){
        try {
            Class.forName(database);//指定连接Mysql数据库
            Connection conn = null;
            switch (database){
                case MYSQL:
                    conn = DriverManager.getConnection(MYSQL_URL, USER_NAME, PASSWORD);//获取连接
                    break;
                case ORACLE:
                    conn = DriverManager.getConnection(ORACLE_URL, USER_NAME, PASSWORD);//获取连接
                    break;
                case SQLSERVER:
                    conn = DriverManager.getConnection(SQLSERVER_URL, USER_NAME, PASSWORD);//获取连接
                    break;
            }
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
