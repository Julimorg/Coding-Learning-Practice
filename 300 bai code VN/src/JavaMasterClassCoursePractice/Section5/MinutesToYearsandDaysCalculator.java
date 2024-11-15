package JavaMasterClassCoursePractice.Section5;

import java.util.Scanner;

public class MinutesToYearsandDaysCalculator  {
    public static void printYearsAndDays (long minutes)
    {
        long hour =  minutes / 60;
        long day =   hour / 24;
        long remainday =  day % 365 ;

        long year = day / 365;

        if ( minutes >= 0 )
        {
                System.out.print(minutes + " min =" + year + "y and" + remainday + "d ");
        }else
        {
            System.out.print("Invalid Value");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        printYearsAndDays(a);
    }
}
