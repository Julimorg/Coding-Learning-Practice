import java.util.Scanner;

public class bai0002 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        tinhHinhtron(a);
    }
    public static void tinhHinhtron( int r)
    {
        double cv=r*2*3.14;
        double dt=r*r*3.14;
        System.out.printf("%.2f %.2f",cv, dt);

    }
}
