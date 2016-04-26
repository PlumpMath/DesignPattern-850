package cn.ygiot.computer;

/**
 * 2016/4/26 14:12
 */
public class Test {
    public static void main(String[] args) {
        ComputerEngineer ce = new ComputerEngineer();
        ComputerFactory cf = new IntelFactory();
        ce.makeComputer(cf);
        ComputerFactory cf2 = new AmdFactory();
        ce.makeComputer(cf2);
    }
}
