package cn.ygiot.problem;

/**
 * 2016/4/26 14:37
 */
public class MysqlInfoFactory implements DatabaseInfoFactory {

    @Override
    public DatabaseInfo createDatabaseInfo() {
        MysqlInfo info = new MysqlInfo();
        info.setCompany("oracle");
        info.setDatabaseName("mysql");
        info.setMoney(0);
        return info;
    }
}
