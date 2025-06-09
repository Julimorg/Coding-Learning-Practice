package JavaMasterClassCoursePractice.Section8_OOP_Polymorphism.CarStation;

public class EletricCar extends Car{

    public EletricCar(String description) {
        super(description);
    }

    public double avgKmPerCharge(){
        return 0;
    }
    public int batterySize(){
        return 0;
    }
}
