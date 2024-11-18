package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class LastDigitChecker {
    public static boolean isValid(int check)
    {
        if( check >= 10 && check <= 1000)
        {
            return true;
        }else return false;
    }

    public static boolean hasSameLastDigit(int num1 ,int num2,int num3)
    {
        if ( isValid(num1) && isValid(num2) && isValid(num3) )
        {
                int a = num1 % 10;
                int b = num2 % 10;
                int c = num3 % 10;
                if ( a ==b || a == c || b == c)
                {
                    return true;
                }
        }return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(isValid(a));
        System.out.print(hasSameLastDigit(a,b,c));
    }
}
