package JavaMasterClassCoursePractice;

import java.util.Scanner;

public class LeapYearCalculator {

    public static boolean isLeapYear ( int year)
    {
        if (year >= 1 && year <= 9999)
        {
            if ( year % 4 == 0 && ( year % 100 != 0 || year % 400 == 0) )
            {
                return true;
            }else return false;

        }else return false;
    }



    public static void main(String[] args) {
            Scanner sc  = new Scanner(System.in);
            int a  = sc.nextInt();
       System.out.print("" + isLeapYear(a));
    }
}
