import java.util.Scanner;

import static java.lang.Math.sqrt;

public class bai0006 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double cv=a+b+c;
       double  p =  cv / 2 ;
       double s = sqrt(p*(p-a)*(p-b)*(p-c));
       System.out.printf("%.1f %.3f", cv , s);
    }
}
