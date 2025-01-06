package JavaMasterClassCoursePractice.OOP_Inheritance.OOP12;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 400, "Huge");
        doAniamlStuff(animal,"Slow");

        Dog dog = new Dog();
        doAniamlStuff(dog,"fast");

        Dog yorkie = new Dog("Yorkie",15);
        doAniamlStuff(yorkie,"fast");
        Dog retriever = new Dog("Retriever",20,"Floppy","Swimmer");
        doAniamlStuff(retriever,"slow");

        Dog wolf = new Dog("Wolf",40);
        doAniamlStuff(wolf,"slow");

        Fish goldie = new Fish("Gold Fish", 0.25,2,3);
        doAniamlStuff(goldie,"fast");
    }
    public static void doAniamlStuff(Animal animal, String speed)
    {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("--------");
    }
}
