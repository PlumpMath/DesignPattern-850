package cn.ygiot.speed;

/**
 * 2016/4/28 16:59
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A();
        ProtoOne p = new ProtoOne(0,0,a);
        long start1 = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            new ProtoOne(i,i,new A());
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
