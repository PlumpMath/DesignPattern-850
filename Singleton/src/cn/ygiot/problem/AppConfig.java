package cn.ygiot.problem;

import java.io.InputStream;
import java.util.Properties;

/**
 * 2016/4/27 16:01
 */
public class AppConfig {
    private String centerNumber;
    private String appId;
    private String token;

    public String getCenterNumber() {
        return centerNumber;
    }

    public String getAppId() {
        return appId;
    }

    public String getToken() {
        return token;
    }
    public AppConfig(){
        readPropertiesFile();
    }

    private void readPropertiesFile() {
        Properties proerties = new Properties();
        InputStream is = null;
        try {
            is = getClass().getResourceAsStream("/message.properties");
            proerties.load(is);
            centerNumber = proerties.getProperty("centerNumber");
            appId = proerties.getProperty("appId");
            token = proerties.getProperty("token");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "AppConfig "+
                super.toString()
                +" {" +
                "centerNumber='" + centerNumber + '\'' +
                ", appId='" + appId + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
