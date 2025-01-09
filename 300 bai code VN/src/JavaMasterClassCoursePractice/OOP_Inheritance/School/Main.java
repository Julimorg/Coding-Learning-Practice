package JavaMasterClassCoursePractice.OOP_Inheritance.School;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your address: ");
        String address = sc.nextLine();
        Person person = new Person(name, address);
        System.out.println(person);
        System.out.println("Please enter your entity!\n If you are a Student - press 'Stu'! \n If you are a Staff - press 'Sta'! ");
        String entity = sc.nextLine();
        System.out.println("---------------");
        switch(entity) {
            case "Stu":
                System.out.print("Enter your program: ");
                String program = sc.nextLine();
                System.out.print("Enter your year: ");
                int year = sc.nextInt();
                System.out.print("Enter your score: ");
                double score = sc.nextDouble();
                Student student = new Student(name,address,program,year,score);
                System.out.println(student);
                System.out.print("Your Rating: " + student.getRating());
                break;
            case "Sta":
                System.out.print("Enter your school name: ");
                String school = sc.nextLine();
                System.out.print("Enter your salary: ");
                double salary = sc.nextDouble();
                System.out.print("Enter your percent salary: ");
                int percent = sc.nextInt();
                Staff staff = new Staff(name,address,school,salary);
                System.out.println(staff);
                System.out.print("Your Salary: " + staff.upToSalary(percent));
                break;
            default:
                System.out.print("Invalid input!");
                break;
        }

    }
}
