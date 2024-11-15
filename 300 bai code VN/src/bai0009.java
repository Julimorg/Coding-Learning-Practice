import java.util.Scanner;

public class bai0009 {
    public static double calAvr(int a, int b ,int c)
    {
        double avr = (double )( a * 2  + b * 2 + c) / 5;
        return avr;
    }

    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.printf("%.1f", calAvr(a,b,c));

    }
}
