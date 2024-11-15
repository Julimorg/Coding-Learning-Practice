package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class switchEnhanced {

    public static String getQuarter(String month)
    {
        return switch(month)
        {
            case "January", "February", "March" -> "1st";
            case "April" , "May" ,"Jun" -> "2nd";
            case "July" , "August" , "September" -> "3rd";
            case "October" , "November", "December" -> "4th";
            default -> {
                String badResponse = month + " is bad ";
                yield  badResponse;
            }
        };
    }



    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            System.out.print(""+ getQuarter(a));
    }
}
