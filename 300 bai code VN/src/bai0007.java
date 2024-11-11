import java.util.Scanner;

public class bai0007 {
    public static double areacalc(int a, int b)
    {
        double s = (double) ( a * b ) / 2;
        return s;
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.printf("%.2f", areacalc(a,b));

    }
}
