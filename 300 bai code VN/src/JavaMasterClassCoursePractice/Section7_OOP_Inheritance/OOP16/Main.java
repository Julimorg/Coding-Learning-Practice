package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.OOP16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account(50.00);
        Account account2 = new Account(-7.53);
        System.out.println(account.getBalance());
        System.out.println(account2.getBalance());
        double depositAmount;
        //? Input Ammount
        System.out.print("Enter deposit amount for account 1: ");
        depositAmount = sc.nextDouble();
        System.out.printf("\nAdding %.2f to account 1 balance \n\n", depositAmount);
        account.credit(depositAmount);
        //? Display Balances
        System.out.printf("Account balance: %.2f\n",account.getBalance());
        System.out.printf("Account 2 balance: %.2f\n",account2.getBalance());
        //? Input Ammount
        System.out.print("Enter deposit amount for account 2: ");
        depositAmount = sc.nextDouble();
        System.out.printf("\nAdding %.2f to account 2 balance\n\n", depositAmount);
        account2.credit(depositAmount);
        //?Display Balances
        System.out.printf("Account balance: %.2f\n",account.getBalance());
        System.out.printf("Account 2 balance: %.2f\n",account2.getBalance());

    }
}
