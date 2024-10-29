import java.util.Scanner;

import static java.lang.Math.sqrt;

public class bai0008 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double cv = (double) ( a + b + c) / 2;
        double dt =  sqrt(cv * (cv - a) * (cv - b) * (cv - c));
        double r =  (double) ( a * b * c) / ( 4 * dt);
        System.out.printf("%.3f", r);
    }
}
