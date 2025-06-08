package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.TypeOfInheritance.SingleInheritance.Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        String name = sc.nextLine();

        System.out.print("Input quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Input type: ");
        String type = sc.next();

        System.out.print("Input age: ");
        int age = sc.nextInt();

        System.out.print("Input location : ");
        String location = sc.next();

        System.out.print("Input dob: ");
        String dob = sc.nextLine();

       Lion lion = new Lion(name, quantity, type, age , location, dob);

       lion.introduceAnimal();
    }
}
