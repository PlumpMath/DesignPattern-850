package cn.ygiot.problem;

/**
 * 2016/4/26 14:37
 */
public class SqlserverInfoFactory implements DatabaseInfoFactory {

    @Override
    public DatabaseInfo createDatabaseInfo() {
        SqlserverInfo info = new SqlserverInfo();
        info.setCompany("Microsoft");
        info.setDatabaseName("SqlServer");
        info.setMoney(100000);
        return info;
    }
}
