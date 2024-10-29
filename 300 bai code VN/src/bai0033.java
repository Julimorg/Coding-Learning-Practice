import java.util.Scanner;

public class bai0033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }

            }
            System.out.println(count);
        }
    }
}
