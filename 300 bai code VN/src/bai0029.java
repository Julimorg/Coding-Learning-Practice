import java.util.Scanner;

public class bai0029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        for ( int  i = 1; i <= n; i++ ) {
            if ( n % i == 0 ) {
                temp++;
            }
        }
        if ( temp == 2)
        {
            System.out.println("Yes");
        }else
        {
            System.out.println("No");
        }
    }
}
