package cn.ygiot.computer;

/**
 * 2016/4/26 13:56
 */
public interface ComputerFactory {
    public Cpu createCpu();
    public MainBoard createMainBoard();
}
