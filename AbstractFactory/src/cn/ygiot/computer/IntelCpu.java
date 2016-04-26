package cn.ygiot.computer;

/**
 * 2016/4/26 13:59
 */
public class IntelCpu implements Cpu {
    private int pins;
    public IntelCpu(int pins) {
        this.pins = pins;
    }
    @Override
    public void calculate() {
        System.out.println("IntelCpu calculate..."+"  pins:"+pins);
    }
}
