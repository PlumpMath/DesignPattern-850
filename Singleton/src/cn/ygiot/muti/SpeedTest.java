package cn.ygiot.muti;

/**
 * 2016/4/27 19:08
 */
public class SpeedTest {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            MutiSingleton.getInstance();
        }
        long end1 = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            MutiSingleton2.getInstance();
        }
        long end2 = System.currentTimeMillis();
        System.out.println("String类型用时:"+(end1-start1));
        System.out.println("Integer类型用时:"+(end2-start2));
    }
}
