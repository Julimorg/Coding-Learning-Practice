package JavaMasterClassCoursePractice.Section5;

import java.util.Scanner;

public class EqualSumChecker {
    public static boolean hasEqualSum ( int num1, int num2 , int num3)
    {
        int sum = num1  + num2;
        if (sum == num3)
            return true;
        else return false;

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(""+hasEqualSum(num1, num2, num3));
    }
}
