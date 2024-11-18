package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second)
    {
        int compare;
        if ( first > second)
        {
            compare = first;
        }else
        {
            compare = second;
        }
        if ( first >= 10 && second >= 10)
        {
            for (int i = compare ; i > 1; i-- )
            {
                if ( first % i == 0  && second % i == 0)
                {
                    return i;
                }
            }
        }else return -1;
        return compare;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getGreatestCommonDivisor(a,b));
    }
}
