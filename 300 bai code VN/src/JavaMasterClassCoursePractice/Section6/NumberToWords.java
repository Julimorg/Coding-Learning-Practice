package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class NumberToWords {

    public static void numberToWords(int number)
    {
        int rev = reverse(number);
        int checkRev = getDigitCount(rev);
        int checkOri = getDigitCount(number);
        int missingZeros = checkOri - checkRev;
        if( number > 0)
        {
            for(int i = 1; rev != 0; i++)
            {
                int a = rev % 10;
                rev /= 10;
                    switch (a) {
                        case 0 -> System.out.println("Zero");
                        case 1 -> System.out.println("One");
                        case 2 -> System.out.println("Two");
                        case 3 -> System.out.println("Three");
                        case 4 -> System.out.println("Four");
                        case 5 -> System.out.println("Five");
                        case 6 -> System.out.println("Six");
                        case 7 -> System.out.println("Seven");
                        case 8 -> System.out.println("Eight");
                        case 9 -> System.out.println("Nine");
                        default -> System.out.println("Invalid Number ");
                    }
            }
            for (int j = 0; j < missingZeros; j++) {
                System.out.println("Zero");
            }

        }else if ( number == 0)
        {
            System.out.print("Zero");
        }else {
            System.out.print("Invalid Value");
        }
    }
   public static int reverse(int number)
    {
        int revNum = 0;
            for(int i = 1; number != 0 ; i++)
            {
                int a = number % 10;
                number /= 10;
                revNum = revNum * 10 + a;
            }

        return revNum;
    }
    public static int getDigitCount(int number)
    {
        int count = 0;
        if ( number > 0)
        {
            for(int i = 1; number != 0;i++)
            {
                int a = number % 10;
                number /= 10;
                count++;
            }
        }else if ( number == 0)
        {
            return 1;
        }else return -1;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Get count: ");
        System.out.print(getDigitCount(a));
        System.out.print("\n");
        System.out.print("Get number: ");
        System.out.println(reverse(a));
        System.out.print("\n");
        numberToWords(a);
    }
}
