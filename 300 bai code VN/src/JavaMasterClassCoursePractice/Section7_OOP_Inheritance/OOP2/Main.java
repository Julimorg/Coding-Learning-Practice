package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.OOP2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b  = sc.nextDouble();
        Account acc  = new Account();
        acc.depositingFunds(a);
        System.out.println("\n");
        acc.widthdrawingFunds(b);
    }
}
