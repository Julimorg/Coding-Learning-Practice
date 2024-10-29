import java.util.Scanner;

public class bai0032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0 ;
        int sum = 0 ;
        for (int i = m ;  i  <= n ; i++)
        {
            if ( i % 3 == 0  || i % 5 == 0)
            {
                count++;
            }
            if ( i % 2  == 0 )
            {
                sum += i;
            }
        }
        System.out.printf("%d ",count);
        System.out.printf("%d ",sum);
    }
}
