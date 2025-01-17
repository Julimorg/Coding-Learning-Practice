package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.School;

public class Staff extends Person{
    public String school;
    public double salary;
    public Staff(String name, String address, String school, double salary) {
        super(name, address);
        this.school = school;
        this.salary = salary;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "school='" + school + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }

    public double  upToSalary(int percent)
    {
        return salary + (salary * percent) / 100;
    }
}
