package SOLID.Practice3_Liskov_Substitution_Principle;

public class Gasoline extends Vehicle implements EngineVehicle{
    @Override
    public void startEngine() {
        System.out.println("Starting gasoline engine...");
    }
}
