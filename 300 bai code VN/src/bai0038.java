import java.util.Scanner;

public class bai0038 {

    public static boolean countPrime(int n) {
        if ( n < 2 )
        {
            return false;
        }
        for ( int i = 2; i <= Math.sqrt(n); i++ )
        {
            if ( n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        for ( int i = 1 ;  ; i++ )
        {
            if (countPrime(i))
            {
                count++;
                System.out.print(i + " ");
            }
            if ( count == a)
            {
                break;
            }
        }
    }

}
