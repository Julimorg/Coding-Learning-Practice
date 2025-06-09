package JavaMasterClassCoursePractice.Section8_OOP_Polymorphism.Car;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void startEngine(){
        System.out.println("The car's engine is starting");
    }
    public void accelerate(){
        System.out.println("The car is accelerating");
    }
    public void brake(){
        System.out.println("The car is braking");
    }
}
