import java.util.Scanner;

public class bai0010    {

    public static void main(String[] args) {
        int app,stu;
        Scanner sc = new Scanner(System.in);
        app = sc.nextInt();
        stu = sc.nextInt();
        int fair = ( app / stu ) ;
        int res =  ( app % stu );
        System.out.printf("%d %d ", fair, res );
    }
}
