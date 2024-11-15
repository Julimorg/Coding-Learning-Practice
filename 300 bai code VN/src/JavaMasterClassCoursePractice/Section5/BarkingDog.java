package JavaMasterClassCoursePractice.Section5;

import java.util.Scanner;

public class BarkingDog {
    public static boolean  shouldWakeUp ( boolean barking, int hourofday)
    {
                if (hourofday >= 0 &&  hourofday <= 23) {
                    if ( (hourofday < 8 || hourofday > 22) && barking )
                    {
                        return true ;
                    }else return false;
                } else return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("" +shouldWakeUp(true,a));
    }
}
