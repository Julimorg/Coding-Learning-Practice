package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.UpCastingAndDownCasting.Animal;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("George", 100);
        Animal animal = lion;
        System.out.println(animal);
        animal.makeSound();
        animal.animalName();
    }
}
