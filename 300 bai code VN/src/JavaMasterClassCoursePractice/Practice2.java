package JavaMasterClassCoursePractice;

import java.util.Scanner;

public class Practice2 {
//    Cách 1
    public static  void checkNumber(int number)
    {
        if (number > 0)
        {
            System.out.print("positive");
        }else if ( number  <  0)
        {
            System.out.print("negative");
        }else
        {
            System.out.print("zero");
        }
    }
//    Cách 2
    public static void CheckNum2(int num)
    {
        System.out.print(" " + (num > 0 ? "positive" : (num <  0) ? "negative" : "zero"));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        checkNumber(a);
        CheckNum2(b);
    }
}
