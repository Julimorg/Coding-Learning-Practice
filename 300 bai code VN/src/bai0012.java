import java.util.Scanner;

public class bai0012 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int coupleFirst =  a / 10;
        int coupleLast = a % 100;
        if ( coupleLast == 0)
        {
            System.out.printf("%d 00", coupleFirst);
        }else
        {
            System.out.printf("%d %02d", coupleFirst, coupleLast);
        }

    }
}
