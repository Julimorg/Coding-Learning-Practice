package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class tryCatch01 {
    public static String getInputFromScanner(int currentYear)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = sc.nextLine();
        System.out.println("What is your in year are you born?: ");
        boolean validDOB = false;

        String born = sc.nextLine();
        int year = Integer.parseInt(born);
        int yearBirth = currentYear - year ;
        System.out.println("So your age is: " + yearBirth);
        return " " + name + " " + year + " " + yearBirth;
    }
    public static int CheckData(int currentYear, String dateofbirth)
    {
        int dob = Integer.parseInt(dateofbirth);
        int minimumYear = currentYear - 125;;
        if( ( dob < minimumYear ) || ( dob > minimumYear ) )
        {
            return -1;
        }

        return (currentYear - dob);
    }

    public static void main(String[] args) {
        int currentYear = 2024;
        try{
            System.out.println(getInputFromScanner(currentYear));
        }catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
