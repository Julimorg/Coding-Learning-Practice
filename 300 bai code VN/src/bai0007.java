import java.util.Scanner;

public class bai0007 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        double s = (double) ( a * b ) / 2;
        System.out.printf("%.2f", s);

    }
}
