package SOLID.Practice4_InterfaceSegregationPrinciple;

public class Robot implements Workable{
    @Override
    public void work() {
        System.out.println("Robot is working...");
    }
}
