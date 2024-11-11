import java.util.Scanner;

public class bai0005 {
    public static double calcavg( int a,int b, int c)
    {
        double avr = ( a + b + c ) / 3.0;
        return Math.round(avr * 10.0) / 10.0;
    }
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println(calcavg(a,b,c));

    }
}
