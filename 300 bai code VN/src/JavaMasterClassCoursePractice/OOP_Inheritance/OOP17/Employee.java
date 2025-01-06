package JavaMasterClassCoursePractice.OOP_Inheritance.OOP17;

public class Employee extends Worker{
    private long employeeid;
    private String hireDate;
    private static int emplpoyeeNo = 1;
    public Employee()
    {

    }
    public Employee(String name, String birthDate, String hireDate)
    {
        super(name, birthDate);
        this.employeeid = Employee.emplpoyeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld=" + employeeid +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
