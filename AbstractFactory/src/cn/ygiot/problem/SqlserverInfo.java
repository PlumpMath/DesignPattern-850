package cn.ygiot.problem;

/**
 * 2016/4/26 14:35
 */
public class SqlserverInfo implements DatabaseInfo {
    private String databaseName;
    private String company;
    private int money;
    @Override
    public String getDatabaseName() {
        return databaseName;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public int getMoney() {
        return money;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
