package cn.ygiot.simplefactory3;

import java.sql.Connection;

/**
 * 2016/4/22 10:41
 */
public class Test {
    public static void main(String[] args) {
        Connection conn = ConnectionFactory.getConnection(ConnectionFactory.MYSQL);
        Connection conn1 = ConnectionFactory.getConnection(ConnectionFactory.ORACLE);
    }
}
