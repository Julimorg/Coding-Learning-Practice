package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class isEvenNumber {

    public static boolean isEvenNumber(int num)
    {
        return num % 2 == 0;
    }
    public static void  displayEvenNumber(int num)
    {
        int i = 1;
        int evenCount = 0;
        int oddCount = 0;
        while( i <= num)
        {
            if(isEvenNumber(i))
            {
                System.out.print("_" + i);
                evenCount++;
                if (evenCount == 5)
                {
                    break;
                }
            }else {
//                System.out.print("_" + i);
                oddCount++;
            }
            i++;
        }
        System.out.print("\nTotal of even number are: " + evenCount);
        System.out.print("\n");
        System.out.print("Total of odd number are: " + oddCount);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(isEvenNumber(a) ? "Even" : "Odd");
        System.out.print("\n");
        displayEvenNumber(a);
    }
}
