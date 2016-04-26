package cn.ygiot.database;

import java.sql.Connection;

/**
 * 2016/4/26 10:10
 */
public class Test {
    public static void main(String[] args) {
        Connection connection = DBUtil.getConnection();
        System.out.println(connection);
    }
}
