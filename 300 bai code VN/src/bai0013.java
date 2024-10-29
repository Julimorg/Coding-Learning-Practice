import java.util.Scanner;

public class bai0013 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int max = 0;
        if (a == b && b == c) {
            System.out.println("=");
            return;
        } else {
            max = Math.max(Math.max(a, b), c);
        }
        System.out.printf("%d", max);
    }
}
