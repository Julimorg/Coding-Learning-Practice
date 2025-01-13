package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.OOP1;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Red");
        car.setDoors(2);
        car.setConvertible(true);
        car.setModel("Model 1");
        car.setMake("PORSCHE");

        System.out.println(" " + car.getMake());
        System.out.println(" " + car.getModel());
        System.out.println(" " + car.getColor());

        car.describeCar();
    }
}
