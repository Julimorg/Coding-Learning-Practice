package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class natoAlphabet {
    public static String checkAlphabet( char alphabet)
    {
        return switch(alphabet)
        {
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            default -> "Unvalid Alphabet";
        };
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a =sc.next().charAt(0);
        System.out.println(checkAlphabet(a));
    }
}
