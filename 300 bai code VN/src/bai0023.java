import java.util.Scanner;

public class bai0023 {
    public static <bool> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for ( int i = 1 ; i <= n ; i++)
        {
            if ( i % 3  == 0 )
            {
                System.out.printf("%d ",i);
                flag = false;
            }
        }
        if (flag == true)
        {
            System.out.printf("-");
        }
    }
}
