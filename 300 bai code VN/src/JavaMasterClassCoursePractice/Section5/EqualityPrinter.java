package JavaMasterClassCoursePractice.Section5;

import java.util.Scanner;

public class EqualityPrinter {

    public static void printEqual(int num1, int num2 ,int num3  )
    {
        if ( num1 < 0 || num2 < 0 || num3 < 0 )
        {
            System.out.print("Invalid Value");
        }else if ( num1 == num2 && num2 == num3)
        {
            System.out.print("All numbers are equal");
        }else if ( num1 == num2 || num1 == num3 || num2 == num3 )
        {
            System.out.print("Neither all are equal or different");
        }else
        {
            System.out.print("All numbers are different");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        printEqual(a,b,c);
    }
}
