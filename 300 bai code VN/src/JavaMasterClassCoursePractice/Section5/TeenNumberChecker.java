package JavaMasterClassCoursePractice.Section5;

import java.util.Scanner;

public class TeenNumberChecker {
    public static boolean hasTeen(int teen1, int teen2, int teen3) {

        if ( teen1 >= 13 && teen1 <= 19 ||  teen2 >= 13 && teen2 <=19 ||  teen3 >= 13 && teen3 <= 19 )
            {
                return true;
            }else return false;

    }
    public static boolean isTeen ( int teen1)
    {
        if ( teen1 >= 13 && teen1 <= 19 )
            return true;
        else return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int teen1 = sc.nextInt();
        int teen2 = sc.nextInt();
        int teen3 = sc.nextInt();
        int teen4 = sc.nextInt();
        System.out.print("" + hasTeen(teen1, teen2, teen3));
        System.out.print("" + isTeen(teen1));
    }
}
