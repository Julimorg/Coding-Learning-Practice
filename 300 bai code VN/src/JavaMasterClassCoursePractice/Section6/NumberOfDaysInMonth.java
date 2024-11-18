package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class NumberOfDaysInMonth {

    public static int getDaysInMont(int month, int year )
    {

        if (year < 1 || year > 9999) {
            return -1;
        }

            return switch(month)
            {
                case 1,3,5,7,8,10,12 -> 31;
                case 4,6,9,11 -> 30;
                case 2 -> isLeapYear(year) ? 29 : 28;
                default -> -1;
            };
    }
    public static boolean isLeapYear(int year)
    {
        if (year < 1 || year > 9_999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
//        System.out.print(isLeapYear(a));
        System.out.print("\n");
        System.out.print(getDaysInMont(a,b));
    }
}
