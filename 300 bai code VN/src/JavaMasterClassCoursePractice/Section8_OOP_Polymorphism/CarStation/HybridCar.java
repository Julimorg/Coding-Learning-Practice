package JavaMasterClassCoursePractice.Section8_OOP_Polymorphism.CarStation;

public class HybridCar extends Car {

    public HybridCar(String description) {
        super(description);
    }

    public double avgKmPerLitre(){
        return  0;
    }
    public int batterySize(){
        return  0;
    }
    public int cylinders(){
        return 0;
    }
}
