package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.TypeOfInheritance.SingleInheritance.Animal;

public class Lion extends Animal{
    private String location;
    private String dob;

    public Lion(String name, int quantity, String type, int age , String location, String dob) {
        super(name, quantity, type, age);
        this.location = location;
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void introduceAnimal(){
        System.out.println("This animal name is: " + getName());
        System.out.println("This animal quantity is: " + getQuantity());
        System.out.println("This animal type is: " + getType());
        System.out.println("This animal extinct is: " + doesExtinct());
        System.out.println("This animal age is: " + calAge());
    }

}
