import java.util.Scanner;

public class bai0024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for ( int i = 1 ; i <= n ; i++ ) {
            if ( i % 3  == 0)
            {
                count++;
            }
        }
        System.out.printf("%d ",count);
    }
}
