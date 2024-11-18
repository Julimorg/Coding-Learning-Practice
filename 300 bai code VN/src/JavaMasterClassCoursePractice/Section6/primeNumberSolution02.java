package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class primeNumberSolution02 {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(isPrime(a) ? "prime number" : "not prime number");
    }
}
