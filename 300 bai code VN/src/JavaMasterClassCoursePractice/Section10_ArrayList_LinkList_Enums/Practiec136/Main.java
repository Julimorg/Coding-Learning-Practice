package JavaMasterClassCoursePractice.Section10_ArrayList_LinkList_Enums.Practiec136;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);


    public static void Menu(int number, ArrayList<String> groceries){
        switch (number){
            case 1 -> System.out.println("Shut down");
            case 2 -> addItem(groceries);
            case 3 -> System.out.println("Deleting");
            default -> System.out.println("Invalid number");
        }
    }

    public static void addItem(ArrayList<String> groceries) {
        System.out.println("Add item(s) [separate items by comma] : ");

        String[]  items = sc.nextLine().split(",");
        groceries.addAll(List.of(items));

    }


    public static void main(String[] args) {
        System.out.println("Enter menu to choose: ");
        System.out.println("1. Shut down");
        System.out.println("2. Adding");
        System.out.println("3. Deleting");
        System.out.print("Your choose: ");

        ArrayList<String> groceries = new ArrayList<>();

        int number = sc.nextInt();

        Menu(number, groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
    }
}
