package cn.ygiot.problem;

/**
 * 2016/4/26 14:42
 */
public class Test {
    public static void main(String[] args) {
        //同事A的写法   mysql
        DatabaseInfoFactory df = new MysqlInfoFactory();
        DatabaseInfo info = df.createDatabaseInfo();
        System.out.println("数据库:"+info.getDatabaseName()+" 所属公司:"+info.getCompany()+" 费用:"+info.getMoney());
        //同事B的写法 oracle
        DatabaseInfoFactory df1 = new OracleInfoFactory();
        DatabaseInfo info1 = df1.createDatabaseInfo();
        System.out.println("数据库:"+info1.getDatabaseName()+" 所属公司:"+info1.getCompany()+" 费用:"+info1.getMoney());
        //同事C的写法 sqlserver
        DatabaseInfoFactory df2 = new SqlserverInfoFactory();
        DatabaseInfo info2 = df2.createDatabaseInfo();
        System.out.println("数据库:"+info2.getDatabaseName()+" 所属公司:"+info2.getCompany()+" 费用:"+info2.getMoney());
        //ConnFactory mysqlConnFactory = new MysqlConnFactory();
        //Connection mysqlConn = mysqlConnFactory.getConnection();
    }
}
