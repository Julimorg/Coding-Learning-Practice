import java.util.Scanner;

public class bai0001 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        tinhCV(a);
    }
    public static void tinhCV(int a)
    {
        int cv = a * 4;
        int dt = a * a;
        System.out.print("" + cv + " " + dt);
    }
}
