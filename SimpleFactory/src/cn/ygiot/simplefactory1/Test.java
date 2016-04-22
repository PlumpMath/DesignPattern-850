package cn.ygiot.simplefactory1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 2016/4/22 10:12
 */
public class Test {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");//指定连接Mysql数据库
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/student", "root", "root");//获取连接
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
/**
 * 如果你没有学过JDBC看不懂也没关系，这两句是固定写法，就是这个程序和数据库建立了连接，并且把连接封装成了Connection对象
 */