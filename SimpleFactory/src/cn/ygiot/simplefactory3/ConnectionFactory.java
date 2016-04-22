package cn.ygiot.simplefactory3;

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
    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/javademo";
    private static final String ORACLE_URL = "jdbc:oracle:thin:@127.0.0.1:1521:simlink";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";
    public static Connection getConnection(String database){
        try {
            Class.forName(database);//指定连接Mysql数据库
            Connection conn = null;
            switch (database){
                case MYSQL:
                    conn = DriverManager.getConnection(MYSQL_URL, USER_NAME, PASSWORD);//获取连接
                case ORACLE:
                    conn = DriverManager.getConnection(ORACLE_URL, USER_NAME, PASSWORD);//获取连接
            }
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
