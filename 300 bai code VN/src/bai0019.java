import java.util.Scanner;

public class bai0019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int temp = a;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        int soNut = sum % 10;
        System.out.println(soNut);
        if (soNut == 9) {
            System.out.println("may man");
        } else {
            System.out.println("chua may man");
        }
    }
}
