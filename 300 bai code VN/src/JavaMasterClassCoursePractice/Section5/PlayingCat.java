package JavaMasterClassCoursePractice.Section5;

import java.util.Scanner;

public class PlayingCat {

    public static boolean isCatPlaying (boolean summer, int temperature)
    {
        if(summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            } else return false;
        }else if (temperature >= 25 && temperature <= 35) {
            return true;
        }else return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("" +  isCatPlaying(false,a));
    }
}

