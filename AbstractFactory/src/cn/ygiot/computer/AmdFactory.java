package cn.ygiot.computer;

/**
 * 2016/4/26 13:58
 */
public class AmdFactory implements ComputerFactory {
    @Override
    public Cpu createCpu() {
        return new AmdCpu(938);
    }

    @Override
    public MainBoard createMainBoard() {
        return new AmdMainBoard(938);
    }
}
