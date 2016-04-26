package cn.ygiot.computer;

/**
 * 2016/4/26 13:57
 */
public class IntelFactory implements ComputerFactory {
    @Override
    public Cpu createCpu() {
        return new IntelCpu(755);
    }

    @Override
    public MainBoard createMainBoard() {
        return new IntelMainBoard(755);
    }
}
