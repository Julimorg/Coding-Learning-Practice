package JavaMasterClassCoursePractice;

import java.util.Scanner;

public class SecondAndMinuteChallagne {

    public static String getDurationString(int second)
    {
        if ( second >= 0 ) {
            int minute = second / 60;
           return getDurationString(minute, second );
        }
        else {
            return "Invalid Second";
        }

    }
    public static String getDurationString(int minute, int second)
    {
        if ( minute >= 0  &&  (second >= 0 && second <= 59))
        {

            int hour = minute / 60;
//            int hours = second / 3600;
            //? Tính các thời gian còn lại
            int remainderMinute = minute % 60;
            int remainSecond = second % 60;
            return hour + "h " + remainderMinute + "m " + remainSecond + "s ";
        }
        else {
            return "Invalid Minute and Second";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a  =  sc.nextInt();
        System.out.print(" " + getDurationString(46));
        System.out.print("\n");
        System.out.print(" " + getDurationString(5,40));
    }
}
