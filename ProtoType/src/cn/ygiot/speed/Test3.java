package cn.ygiot.speed;

/**
 * 2016/4/28 16:59
 */
public class Test3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        ProtoThree p = new ProtoThree(0,0);
        long start1 = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            new ProtoThree(i,i);
        }
        long end1 = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            p.clone();
        }
        long end2 = System.currentTimeMillis();
        System.out.println("new:"+(end1-start1)+"  clone:"+(end2-start2));
    }
}
