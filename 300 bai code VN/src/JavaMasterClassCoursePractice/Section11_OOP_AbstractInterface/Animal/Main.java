package JavaMasterClassCoursePractice.Section11_OOP_AbstractInterface.Animal;

public class Main {
    public static void main(String[] args) {
            Dog dog = new Dog("Wolf", "big", 100);
            dog.makeNoise();
            doAnimalStuff(dog);
    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("Slow");
    }
}
