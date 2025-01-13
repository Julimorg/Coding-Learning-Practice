package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.OOP17;

public class HourlyEmployee extends Employee {
    private double hourlyPayRate;
    public HourlyEmployee()
    {

    }
    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }
    @Override
    public double collectPay()
    {
        return 40 * hourlyPayRate;
    }
    public double getDoublePay() {
        return 2 * collectPay();
    }

}