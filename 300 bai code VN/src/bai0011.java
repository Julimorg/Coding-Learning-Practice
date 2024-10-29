import java.util.Scanner;

public class bai0011 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int h = a / 3600;
        int min =  (a % 3600 ) / 60;
        int sec = a % 60;
        System.out.printf("%d:%d:%d", h, min, sec);
    }
}
