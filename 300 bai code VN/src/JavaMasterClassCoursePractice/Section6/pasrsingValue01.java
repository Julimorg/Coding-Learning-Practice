package JavaMasterClassCoursePractice.Section6;

public class pasrsingValue01 {

    public static void main(String[] args) {
        int currenYear = 2024;

        String myYear = "2002";

        int dob = Integer.parseInt(myYear);

        System.out.print("" + ( currenYear + dob));

        String a = System.console().readLine();
        double b = System.console().hashCode();
        System.out.print("" + a);
    }
}
