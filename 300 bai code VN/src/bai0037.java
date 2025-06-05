import java.util.Scanner;

public class bai0037 {

    public static String findCommon(int n, int m){

        for(int i = 2; ; i++){
            if ( n % i == 0 && m % i == 0){
                int a = n / i ;
                int b = m / i ;
                return  a + " / "  + b;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(findCommon(n,m));
    }
}
