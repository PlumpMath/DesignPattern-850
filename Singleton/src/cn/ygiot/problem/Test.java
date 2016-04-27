package cn.ygiot.problem;

/**
 * 2016/4/27 16:10
 */
public class Test {
    public static void main(String[] args) {
        String centerNumber = "1058012345565";
        String appId = "8a2329345445c81e015451c9f79b0019";
        String token = "8a23293453e6d5e7015438fe7aac000a";
        Message message = new Message(centerNumber,appId,token);
        message.send("110","救命啊...");
    }
}
