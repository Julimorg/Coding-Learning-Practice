package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class AllFactors {

    public static void printFactors(int number)
    {
        if (number >= 1)
        {
            for(int i = 1 ; i <= number ; i++)
            {
                if ( number % i == 0)
                {
                    System.out.println(i);
                }
            }

        }else {
            System.out.print("Invalid Value");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printFactors(number);
    }
}
