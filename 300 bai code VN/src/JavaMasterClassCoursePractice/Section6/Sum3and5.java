package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class Sum3and5 {
    public static void sumNum( int num)
    {
        int sum = 0;
        int count = 0;
        for ( int i = 1 ; i <= num ; i++ )
        {
            if ( i % 3 == 0 && i % 5 == 0 )
            {
                count++;
                sum += i;
                if ( count == 5)
                {
                    break;
                }
            }

        }
        System.out.print("Sum of all num : " + sum);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        sumNum(a);
    }
}
