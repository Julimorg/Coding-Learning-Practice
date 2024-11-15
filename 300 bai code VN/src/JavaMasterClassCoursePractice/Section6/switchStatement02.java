package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class switchStatement02 {

    public static void switchStatementNew(String calculateMethod, int a ,int b) {
        System.out.println("We have 2 number: " +  a + " and " + b + " Please choose a method to calculate:");
        switch (calculateMethod) {
            case "x":
                System.out.println("You choose + so " + a + " + " + b +" = "  + (a * b));
                break;
            case "sum":
                System.out.println("You choose x so " + a + " + " + b +" = "  + (a + b));
                break;
                case "-":
                    System.out.println("You choose x so " + a + " - " + b + " = "  + (a - b));
                    break;
            case "/":
                System.out.println("You choose x so " + a + " / " + b + " = "  + (a / b));
                break;
            default:
                System.out.print("the method you choose is out range");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();
        int c = sc.nextInt();
        switchStatementNew(a,b,c);

    }
}
