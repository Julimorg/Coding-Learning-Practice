import java.util.Scanner;

public class bai0003 {
    public static void Calculate(int a, int b)
    {
        int cv = ( a + b )  * 2 ;
        int dt = a * b;
        System.out.print("" + cv + " " + dt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calculate(a,b);
    }
}
