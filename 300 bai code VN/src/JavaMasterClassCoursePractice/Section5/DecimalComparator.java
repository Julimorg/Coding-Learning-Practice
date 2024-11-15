package JavaMasterClassCoursePractice.Section5;

import java.util.Scanner;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces ( double num1, double num2)
    {
        if (num1 <0 && num2 >0 || num1 >0 && num2 <0){
           return false;
        }
      double firstNum = num1 * 1000;
        double secondNum = num2 * 1000;
        int firstInit = (int) firstNum;
        int secondInit = (int) secondNum;
        if (firstInit == secondInit){
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
         System.out.print(""+areEqualByThreeDecimalPlaces(a,b));
    }
}
