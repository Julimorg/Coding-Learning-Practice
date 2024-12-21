import java.util.Scanner;

public class bai0034 {
    public static boolean checkCountPrime(int n)
    {
        if ( n < 2)
        {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++)
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
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean hasPrime = false;
        for(int i = m; i <= n; i++)
        {
            if(checkCountPrime(i))
            {
                System.out.print(i + " ");
                hasPrime = true;
            }
        }
        if (!hasPrime) {
            System.out.print("-");
        }

    }
}
