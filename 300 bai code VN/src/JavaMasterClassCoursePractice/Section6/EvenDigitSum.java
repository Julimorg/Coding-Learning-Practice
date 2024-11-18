package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number)
    {
        int sum = 0;
        if ( number >= 0)
        {
            for (int i = 1; number != 0 ; i ++)
            {
            int a = number % 10;
            if ( a % 2 == 0)
            {
                sum += a;
            }
            number = number / 10;
            }
        }else return -1;

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(getEvenDigitSum(a));
    }
}
