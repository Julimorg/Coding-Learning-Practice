import java.util.Scanner;

public class bai0038 {

    public static boolean countPrime(int n) {
        if ( n < 2 )
        {
            return false;
        }
        for ( int i = 2; i < n; i++ )
        {
           if ( i * i == n){
               return true;
           }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(countPrime(a));
    }

}
