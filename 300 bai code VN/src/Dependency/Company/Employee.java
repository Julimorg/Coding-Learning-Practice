package Dependency.Company;

public class Employee {
    private String name;
    private Manager manager;

    public Employee(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }
    public String getManagerName() {
        return manager.getName();
    }
    public String getName(){
        return name;
    }
}
