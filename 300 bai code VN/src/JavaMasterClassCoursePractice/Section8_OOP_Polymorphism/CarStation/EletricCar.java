package JavaMasterClassCoursePractice.Section8_OOP_Polymorphism.CarStation;

public class EletricCar extends Car{

    private double avgKmPerCharges;

    private int batterySize = 6;

    public EletricCar(String description) {
        super(description);
    }
    public EletricCar(String description, double avgKmPerCharges, int batterySize) {
        super(description);
        this.avgKmPerCharges = avgKmPerCharges;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine(){
        System.out.println("BEV -> switch %d kwh battery " + batterySize);
    }
    @Override
    public void runEngine(){
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerCharges);
    }
}
