

package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class MinMax {

    public static void FindMinMax()
    {
        double max = 0;
        double min = 0;
        int loop = 0;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the min and max number: ");
            String number = sc.nextLine();
            double validNumber = Double.parseDouble(number);
            try {
                if (loop == 0 || validNumber < min) {
                    min = validNumber;
                }
                if (loop == 0 || validNumber > max) {
                    max = validNumber;
                }
                loop++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if (loop > 0) {
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("No valid data entered");
        }
    }




    public static void main(String[] args) {
        FindMinMax();
    }
}

