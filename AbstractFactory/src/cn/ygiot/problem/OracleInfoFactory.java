package cn.ygiot.problem;

/**
 * 2016/4/26 14:37
 */
public class OracleInfoFactory implements DatabaseInfoFactory {

    @Override
    public DatabaseInfo createDatabaseInfo() {
        OracleInfo info = new OracleInfo();
        info.setCompany("oracle");
        info.setDatabaseName("oracle");
        info.setMoney(200000);
        return info;
    }
}
