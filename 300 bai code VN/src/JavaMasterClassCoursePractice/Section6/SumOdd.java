package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class SumOdd {

    public static boolean isOdd(int num)
    {
        boolean check = ( num > 0) ? ((num % 2 != 0) ? true : false) : false;
        return check;
    }
    public static int sumOdd(int start, int end)
    {
        int sum = 0;
       if ( end >= start && ( start > 0  ))
       {
           for (int i = start; i <= end; i++)
           {
               if (isOdd(i)) {
                   sum += i;
               }
           }
       }else return -1;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
//        System.out.print((isOdd(a) ? "is odd" : "is not odd"));
        System.out.print(sumOdd(a,b));
    }
}
