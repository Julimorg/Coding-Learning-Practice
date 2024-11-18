package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number)
    {
        int sum = 0;
        int lastDigit = number % 10;
        if( number >= 0)
        {
            for(int i = 1; number >= 10 ; i++ )
            {
                number = number / 10;
            }
            sum = number + lastDigit;
        }else return -1;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(sumFirstAndLastDigit(a));
    }
}
