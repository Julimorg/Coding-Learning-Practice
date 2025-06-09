package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.OOP2_Composition;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public static void addWater()
    {

    }
    public static void pourMilk()
    {

    }
    public static void loadDishwasher()
    {

    }
    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag)
    {
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);

    }
    public  void doKitchenWork()
    {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee()
    {
        if(hasWorkToDo)
        {
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}
class Refrigerator {
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood()
    {
        if(hasWorkToDo)
        {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}
class DishWasher {
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes()
    {
        if(hasWorkToDo)
        {
            System.out.println("Washing Dish");
            hasWorkToDo = false;
        }
    }
}

