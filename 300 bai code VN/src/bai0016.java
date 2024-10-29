import java.util.Scanner;

public class bai0016 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        double avr = (double) ( a + b * 2) /3;
        if( avr >= 8)
        {
            System.out.printf("%.1f\nGioi",avr);
        }else if( avr < 8 && avr >= 6.5)
        {
            System.out.printf("%.1f\nKha",avr);

        }else if( avr < 6.5 && avr >= 5.0)
        {
            System.out.printf("%.1f\nTrung binh",avr);
        }else if( avr < 5 && avr >= 3.5)
        {
            System.out.printf("%.1f\nYeu",avr);

        }else if( avr < 3.5)
        {
            System.out.printf("%.1f\nKem",avr);

        }


    }
}
