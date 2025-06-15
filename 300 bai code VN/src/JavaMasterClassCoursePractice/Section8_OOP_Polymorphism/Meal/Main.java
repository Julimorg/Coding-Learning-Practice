package JavaMasterClassCoursePractice.Section8_OOP_Polymorphism.Meal;

public class Main {
    public static void main(String[] args) {
        Item coke = new Item("coke", "drink",1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();


    }
}
