import java.util.Scanner;

public class bai0035 {

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
        int sum = 0 ;
        double avg = 0.00;
        int count = 0;
        boolean hasPrime = false;
        for(int i = m; i <= n; i++)
        {
            if(checkCountPrime(i))
            {
                count++;
                avg  = ((double) (sum += i) / count);
                hasPrime = true;
            }
        }
        if (count == 0) {
            System.out.print("-");
        } else {
             avg = (double) sum / count;
            System.out.printf("%.2f", avg);
        }
    }
}
