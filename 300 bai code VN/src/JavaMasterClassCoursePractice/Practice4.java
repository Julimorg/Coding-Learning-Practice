package JavaMasterClassCoursePractice;

import java.util.Scanner;

public class Practice4 {
    public static double convertToCentimeters(int inches)
    {
        return inches * 2.54;
    }
    public static double convertToCentimeters( int inches,int feet)
    {
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(convertToCentimeters(a));
        System.out.print("\n");
        System.out.println(convertToCentimeters(a,b));
    }
}
