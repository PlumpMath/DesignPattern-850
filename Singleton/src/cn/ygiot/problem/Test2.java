package cn.ygiot.problem;

/**
 * 2016/4/27 16:27
 */
public class Test2 {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        Message message = new Message(appConfig.getCenterNumber(),appConfig.getAppId(),appConfig.getToken());
        message.send("110","救命啊...");
    }
}
