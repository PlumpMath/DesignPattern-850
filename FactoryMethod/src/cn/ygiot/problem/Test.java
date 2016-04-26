package cn.ygiot.problem;

import java.sql.Connection;

/**
 * 2016/4/22 10:41
 */
public class Test {
    public static void main(String[] args) {
        Connection conn = ConnectionFactory.getConnection(ConnectionFactory.MYSQL);
        //Connection conn1 = ConnectionFactory.getConnection(ConnectionFactory.ORACLE);
        //Connection conn2 = ConnectionFactory.getConnection(ConnectionFactory.SQLSERVER);
        System.out.println(conn);
    }
}
