package cn.ygiot.computer;

/**
 * 2016/4/26 14:05
 */
public class IntelMainBoard implements MainBoard {
    private int cpuHoles;

    public IntelMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("IntelMainBoard  cpu插槽数:"+cpuHoles);
    }
}
