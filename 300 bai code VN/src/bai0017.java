import java.util.Scanner;

public class bai0017 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
       if(a == 2 || a == 3 || a == 4 ) {
           System.out.print("Mua Xuan");
       }else if ( a == 1 || a == 12 || a == 11)
       {
           System.out.print("Mua Dong");
       }else if( a == 5 || a == 6 || a == 7)
       {
           System.out.print("Mua Ha");
       }else if ( a == 8 || a == 9 || a == 10)
       {
           System.out.print("Mua Thu");
       }else {
           System.out.print("Cha co mua nao hon so 12 dau");
       }
    }
}
