package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.UpCastingAndDownCasting.Animal;

public class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public void makeSound(){
        System.out.println("MakeSound");
    }
    public void animalName(){
        System.out.println("Animal: " + name);
    }
}
