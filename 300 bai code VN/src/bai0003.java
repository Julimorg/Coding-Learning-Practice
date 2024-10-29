import java.util.Scanner;

public class bai0003 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int cv = ( a +  b) * 2;
        int dt = a * b;
        System.out.println("" + cv  + " "  + dt);
    }
}
