import java.util.Scanner;

public class bai0031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0 ;
        for (int i = m; i <= n; i++) {
            if ( i % 3 == 0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
