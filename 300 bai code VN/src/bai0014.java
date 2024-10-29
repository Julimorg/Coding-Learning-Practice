import java.util.Scanner;

public class bai0014 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        do {
            if(  a > 0 && a <= 11)
            {
                System.out.print("Thieu nhi");
            }else if ( a > 11 &&  a <= 25)
            {
                System.out.print("Thieu nien");
            }else if ( a > 25 &&  a <= 50)
            {
                System.out.print("Trung nien");
            }else if( a > 50)
            {
                System.out.print("Lao nien");
            }
        }while( a < 0 || a >= 150);
    }
}
