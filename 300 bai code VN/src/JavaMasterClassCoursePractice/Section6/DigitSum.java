package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class DigitSum {

    public static int sumDigits(int n) {
        int sum = 0;
        if ( n > 0 )
        {
            for (int i = 1; n != 0 ; i++)
            {
                int a = n % 10;
                n = n / 10;
                sum += a;
            }

        }else return -1;
        return sum ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumDigits(n));
    }
}



