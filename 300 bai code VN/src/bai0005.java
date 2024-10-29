import java.util.Scanner;

public class bai0005 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double tbc = (double) (a + b + c) /3;
        System.out.printf("%.1f", tbc);

    }
}
