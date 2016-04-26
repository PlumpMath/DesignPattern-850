package cn.ygiot.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 2016/4/26 10:02
 */
public class DBUtil {
    private DBUtil(){
    }
    private static  Properties properties;
    static {
        try {
            properties = new Properties();
            properties.load(ClassLoader.getSystemResourceAsStream("db.properties"));
            Class.forName(properties.getProperty("driver"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        try {
            Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
