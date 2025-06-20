package JavaMasterClassCoursePractice.Section8_OOP_Polymorphism.Car;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }


    public String getName() {
        return name;
    }


    public String startEngine(){
       return "The car's engine is starting";
    }
    public String accelerate(){
        return "The car is accelerating";
    }
    public String brake(){
        return "The car is braking";
    }
}
