package JavaMasterClassCoursePractice.Section8_OOP_Polymorphism.Meal;

public class Burger extends Item{
    public Item extra1;
    public Item extra2;
    public Item extra3;

    public Burger(String name, String type, double price){
        super(name, type, price);
    }
    public Burger(String name, String type, double price, Item extra1, Item extra2, Item extra3){
        super(name, type, price);
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
    }
    public void addToppings(){

    }
}
