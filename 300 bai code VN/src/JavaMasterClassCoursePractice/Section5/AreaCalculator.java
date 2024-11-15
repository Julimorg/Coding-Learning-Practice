package JavaMasterClassCoursePractice.Section5;

import java.util.Scanner;

import static java.lang.Math.PI;

public class AreaCalculator {

    public static double area(double radius)
    {
        double s = ( radius * radius ) * PI;
        if ( radius >= 0)
        {
            return s;
        }else return -1.0;
    }
    public static double area( double x, double y)
    {
            double radius =  x * y;
        if ( x >= 0  &&  y >= 0)
        {
            return radius;
        }else return -1.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(" " + area(c));
        System.out.print(" " +  area( a, b));


    }
}
