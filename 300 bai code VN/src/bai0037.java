import java.util.Scanner;

public class bai0037 {

    public static int findCommon(int n, int m){
        int r ;
        for(int i = 1; m!=0 ; i++){
               r = n % m ;
               n = m;
               m = r;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int common = findCommon(n,m);
        System.out.println((n / common) + " / " + (m / common));
    }
}
