import java.util.Scanner;

public class bai0022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tienDien = 0;
        if (n <= 50) {
            tienDien = n * 600;
        } else if (n <= 100) {
            tienDien = 50 * 600 + (n - 50) * 800;
        } else if (n <= 200) {
            tienDien = 50 * 600 + 50 * 800 + (n - 100) * 1100;
        } else {
            tienDien = 50 * 600 + 50 * 800 + 100 * 1100 + (n - 200) * 1500;
        }
        System.out.println(tienDien);
    }
}
