package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2)
    {
        if ( (num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99))
        {

            for( int i = 1 ; (num1 != 0 && num2 !=0 ) ; i++)
            {
                 int a = num1 % 10;
                 int b = num2 % 10;
                num1 /= 10;
                num2 /= 10;
                if ( a == b || a == num2 || b == num1 )
                {
                    return true;
                }
            }

        }return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of shared digits: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print(hasSharedDigit(num1, num2));
    }
}
