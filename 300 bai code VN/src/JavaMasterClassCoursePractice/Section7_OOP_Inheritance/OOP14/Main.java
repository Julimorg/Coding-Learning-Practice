package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.OOP14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String gender = sc.nextLine();
        double avg  = sc.nextDouble();
        int generations = sc.nextInt();

        Family fam = new Family();
            fam.setGender(gender);
            fam.setFamilyName(name);
            fam.setAvgAg(avg);
            fam.setGeneration(generations);

        System.out.println(fam);
        Generation gen = new Generation();
        System.out.println(gen);

    }

}
