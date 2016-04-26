package cn.ygiot.computer;

/**
 * 2016/4/26 14:10
 */
public class ComputerEngineer {
    private Cpu  cpu;
    private MainBoard mainBoard;
    public void makeComputer(ComputerFactory computerFactory){
        this.cpu = computerFactory.createCpu();
        this.mainBoard = computerFactory.createMainBoard();
        testComputer();
    }

    private void testComputer() {
        mainBoard.installCpu();
        cpu.calculate();
    }

}
