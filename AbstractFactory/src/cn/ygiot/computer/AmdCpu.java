package cn.ygiot.computer;

/**
 * 2016/4/26 13:59
 */
public class AmdCpu implements Cpu {
    private int pins;

    public AmdCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("AmdCpu calculate..."+"  pins:"+pins);
    }
}
