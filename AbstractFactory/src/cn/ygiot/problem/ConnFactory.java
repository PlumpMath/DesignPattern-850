package cn.ygiot.problem;

import java.sql.Connection;

/**
 * 2016/4/26 10:31
 */
public interface ConnFactory{
    public Connection getConnection();
}
