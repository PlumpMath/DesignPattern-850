package cn.ygiot.simplefactory2;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 2016/4/22 10:35
 */
public class ConnectionFactory {
    private ConnectionFactory() {
    }
    public static final String CLASS_NAME = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/javademo";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "root";
    public static Connection getConnection(){
        try {
            Class.forName(CLASS_NAME);//指定连接Mysql数据库
            Connection conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);//获取连接
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
