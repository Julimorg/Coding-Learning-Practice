package JavaMasterClassCoursePractice.Section5;

import java.util.Scanner;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour)
    {

        if ( kilometersPerHour <  0)
        {
            return -1;
        }else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour)
    {

        if(kilometersPerHour < 0)
        {
            System.out.println("Invalid Value");
            return;
        }else
        {
//            long perMilesHour = (long)toMilesPerHour(kilometersPerHour);*/
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a  = sc.nextDouble();
       double output = toMilesPerHour(a);
       printConversion(a);
       System.out.print("\n");
       System.out.print(output);
    }
}
