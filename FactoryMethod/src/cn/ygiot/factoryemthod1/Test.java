package cn.ygiot.factoryemthod1;

import java.sql.Connection;

/**
 * 2016/4/26 10:38
 */
public class Test {
    public static void main(String[] args) {
        //mysql
        ConnFactory mysqlConnFactory = new MysqlConnFactory();
        Connection mysqlConn = mysqlConnFactory.getConnection();
        System.out.println(mysqlConn);
        //oracle 请先导入驱动
        //ConnFactory oracleConnFactory = new OracleConnFactory();
        //Connection oracleConn = oracleConnFactory.getConnection();
        //System.out.println(oracleConn);
        //sqlserver  请先导入驱动
        //ConnFactory sqlServerConnFactory = new SqlServerConnFactory();
        //Connection sqlServerConn = sqlServerConnFactory.getConnection();
        //System.out.println(sqlServerConn);
    }
}
