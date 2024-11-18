package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class primeNumberSolution01 {
    public static int checkPrimeNum(int num)
    {
        int count = 0 ;
        for( int i = 1; i <= num; i++ )
        {
            if ( num % i == 0 )
            {
                count++;
            }
        }
        return count;
    }
    public static void displayResult(int num)
    {
        int count = checkPrimeNum(num);
        if (count == 2 )
        {
            System.out.print("the count is : " + count + " so its a prime number ");
        }else
        {
            System.out.print("the count is : " + count + " so its not a prime number ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        System.out.print(checkPrimeNum(num));
        displayResult(num);
    }
}
