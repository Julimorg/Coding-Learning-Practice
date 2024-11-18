package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number)
    {
        int sum = 0 ;
        boolean check;
        if ( number > 0)
        {
            for(int i = 1 ; i < number ; i++)
            {
                if ( number % i == 0)
                {
                    sum += i;
                }
            }
        }else return false;
       return sum == number;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPerfectNumber(number));
    }
}
