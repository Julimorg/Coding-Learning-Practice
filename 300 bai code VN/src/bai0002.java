import java.util.Scanner;

public class bai0002 {
    public static void main(String[] args) {
        int r ;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        double cv = r * 2 * 3.14;
        double dt = r * r * 3.14;
        System.out.printf("%.2f %.2f", cv, dt );

    }
}
