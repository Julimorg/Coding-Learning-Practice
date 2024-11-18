package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class loopPractice_02 {

//?   Cách 1
//    public static void displayResult(double min,double max)
//    {
//        for( double rate = min ; rate <= max ; rate += + 0.25)
//        {
//           double result = calRate(100, rate);
//            System.out.println("100 * " + " " + rate + ":  " + result);
//        }
//    }
//?   Cách 2 - Overload Method
public static void calRate()
{
    for( double  rate = 7.5 ; rate <= 10.0 ;  rate += + 0.25)
    {
        double result = calRate(100, rate);
//       Nếu tính lãi mà hơn 8.0 thì thoát khỏi vòng lặp
        if ( result >= 8.5)
        {
            break;
        }
        System.out.println("100 * " + " " + rate + ":  " + result);
    }
}
    public static double calRate(double amount , double rate)
    {
        return (amount * (rate / 100));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//       displayResult(a,b);
        calRate();
    }
}
