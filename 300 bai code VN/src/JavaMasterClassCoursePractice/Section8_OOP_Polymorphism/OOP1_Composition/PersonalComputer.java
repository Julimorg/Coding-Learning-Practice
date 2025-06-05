package JavaMasterClassCoursePractice.Section8_OOP_Polymorphism.OOP1_Composition;

public class PersonalComputer extends Product {

    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherboard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, MotherBoard motherboard) {
        super(model, manufacturer);
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.computerCase = computerCase;
    }
    private void drawLogo()
    {
        monitor.drawPixelAt(1200,50,"Yellow");
    }
    public void powerUp()
    {
        computerCase.pressPowerButton();
        drawLogo();
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public MotherBoard getMotherboard() {
//        return motherboard;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
}
