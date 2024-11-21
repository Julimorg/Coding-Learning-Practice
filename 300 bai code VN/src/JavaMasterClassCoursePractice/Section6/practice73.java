package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class practice73 {

    public static void SumNumber ()
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 1;
        do
        {
            System.out.print("Enter number #" + count + ":");
            String str = sc.nextLine();
            try{
                int number = Integer.parseInt(str);
                count++;
                sum += number;
            }catch (NumberFormatException nfe)
            {
                System.out.println("Invalid number");
            }
        }while(count <= 5);
        System.out.println("The sum of the numbers is: " + sum);
    }


    public static void main(String[] args) {
        SumNumber();
    }
}
