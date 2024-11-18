package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class NumberPalindrome {

    public static boolean isPalindrome(int num) {
        int reverse  = 0 ;
        int toCheck = num;
        for (int i = 1 ; num != 0 ; i++)
        {
            int lastDigits = num % 10;
            reverse = ( reverse * 10) + lastDigits;
            num = num / 10;
        }
        return toCheck == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isPalindrome(a));
    }
}
