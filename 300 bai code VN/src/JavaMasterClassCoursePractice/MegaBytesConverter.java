package JavaMasterClassCoursePractice;

import java.util.Scanner;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        int megabytes = kiloBytes / 1024;
        int remainingkilobytes = kiloBytes % 1024;
        if ( kiloBytes < 0)
        {
            System.out.print("Invalid Value");
            return;
        }else
        {

            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingkilobytes + " KB");
        }
//        System.out.print( (kiloBytes <  0 ) ? "Invalid Value" : (kiloBytes  + " KB = " + megabytes + " MB and " + remainingkilobytes + " KB "));
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        printMegaBytesAndKiloBytes(a);
    }
}
