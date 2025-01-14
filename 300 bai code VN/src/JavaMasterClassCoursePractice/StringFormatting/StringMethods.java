package JavaMasterClassCoursePractice.StringFormatting;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dob = "25/11/2022";
        int startingIndex = dob.indexOf("2022");
        System.out.println("Starting index = " + startingIndex);
        //?SubString
        System.out.println("Birthdate =  " + dob.substring(startingIndex));
        System.out.println("Month =  " + dob.substring(3,5));

        //? Join String
        String newDate = String.join("/","25", "11", "2022");
        System.out.println("New date = " + newDate);


        //? concat String
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1999");

        String newDate2 = "25".concat("/").concat("03").concat("/").concat("2003");
        System.out.println("New date = " + newDate);
        System.out.println("New date2 = " + newDate2);

        //?Replace String
        System.out.println(newDate.replace('/','-'));
        System.out.println(newDate.replace("1999", "2004"));
        System.out.println(newDate2.replace('/','-'));

        //?Repeat and indet String
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(10));
        System.out.println("ABC".repeat(3).indent(8));

    }

}
