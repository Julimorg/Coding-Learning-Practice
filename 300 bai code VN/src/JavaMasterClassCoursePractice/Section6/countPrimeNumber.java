package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class countPrimeNumber {
    public static boolean isPrime(int num)
    {
        boolean a = (num <= 2) ? ( num == 2) :  true;
        for(int i = 2; i <= (num / 2); i++)
        {
            if ( num % i == 0)
            {
                return false;
            }
        }
        return a;
    }
    public static int countPrime(int num)
    {
        int count = 0;
        for(int i = 1; i <= num ; i++)
        {
            if (isPrime(i))
            {
                count++;
                System.out.print(i + " ");
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.print("Prime number are: " + countPrime(num));

    }
}
