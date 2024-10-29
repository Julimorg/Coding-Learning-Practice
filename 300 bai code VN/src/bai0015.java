import java.util.Scanner;

import static java.lang.Math.sqrt;

public class bai0015 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ( (a + b) > c && (a + c ) > b && (b + c) > a ) {
            double cv = a + b + c;
            double p = (double) cv /2 ;
            double s=sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.printf("Day la 3 canh cua mot tam giac\n%.2f %.1f", cv , s );
        }else {

            System.out.print("Day khong phai la 3 canh cua mot tam giac");
        }
    }
}
