package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage()
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;
        long avg = 0;
        int count = 0;
        while(true)
        {
            boolean checkNum = sc.hasNextInt() ;
            if (!checkNum)
            {
                break;
            }
            sum = sum + sc.nextInt();
            count++;
            sc.nextLine();
        }
        if (count > 0)
        {
            avg = Math.round((double) sum / count);
        }
        System.out.println("SUM = " + sum + " AVG = " + avg );
    }
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
