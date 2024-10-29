import java.util.Scanner;

public class bai0020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // doi to 5k
        int a = n / 5000;
        n %= 5000;
        // doi to 2k
        int b = n / 2000;
        n %= 2000;
        // doi to 1k
        int c = n / 1000;

        System.out.printf("%d %d %d\n", a, b, c);
    }
}
