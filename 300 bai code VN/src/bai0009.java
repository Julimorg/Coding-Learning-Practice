import java.util.Scanner;

public class bai0009 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double avr = (double )( a * 2  + b * 2 + c) / 5;
        System.out.printf("%.1f", avr);

    }
}
