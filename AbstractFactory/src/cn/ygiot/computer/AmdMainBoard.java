package cn.ygiot.computer;

/**
 * 2016/4/26 14:05
 */
public class AmdMainBoard implements MainBoard {
    private int cpuHoles;

    public AmdMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("AmdMainBoard  cpu插槽数:"+cpuHoles);
    }
}
