package cn.ygiot.simplefactory2;

import java.sql.Connection;

/**
 * 2016/4/22 10:41
 */
public class Test {
    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection();
    }
}
