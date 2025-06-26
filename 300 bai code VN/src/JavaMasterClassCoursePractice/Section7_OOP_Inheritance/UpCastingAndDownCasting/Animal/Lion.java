package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.UpCastingAndDownCasting.Animal;

public class Lion extends Animal  {
    private int quantity;
    public Lion(String name, int quantity){
        super(name);
        this.quantity = quantity;
    }

    @Override
    public void makeSound() {
        System.out.println("Lion Sound");
    }

}
