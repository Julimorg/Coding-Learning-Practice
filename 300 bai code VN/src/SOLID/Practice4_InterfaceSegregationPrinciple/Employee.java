package SOLID.Practice4_InterfaceSegregationPrinciple;

public class Employee implements Workable, Eatable, Restable{
    @Override
    public void work() {
        System.out.println("Human is working...");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating...");
    }

    @Override
    public void rest() {
        System.out.println("Human is resting...");
    }
}
