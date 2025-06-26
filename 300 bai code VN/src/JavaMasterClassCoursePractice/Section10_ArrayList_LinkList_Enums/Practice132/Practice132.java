package JavaMasterClassCoursePractice.Section10_ArrayList_LinkList_Enums.Practice132;


import java.util.ArrayList;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Practice132 {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];

        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Bread","PRODUCE",6);
        groceryArray[2] = new GroceryItem("Cheese");


        for (GroceryItem groceryItem : groceryArray) {
            System.out.println(groceryItem);
        }

        System.out.println("-".repeat(20));

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Bread"));
        groceryList.add(new GroceryItem("Cheese"));
        groceryList.add(0, new GroceryItem("Apples","Produce",6));
        groceryList.set(1, new GroceryItem("Potatos","Produce",10));
        System.out.println(groceryList.get(0));
        System.out.println(groceryList);

    }
}
