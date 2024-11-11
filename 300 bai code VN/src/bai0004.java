import java.util.Scanner;

public class bai0004 {
    public static void Calculate(int a, int b)
    {
        int sum =  a + b;
        int multiply =  a * b;
        System.out.println("" + sum + " " + multiply);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calculate(a,b);
    }
}
