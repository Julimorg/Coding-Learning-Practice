package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.OOP17;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //? Input Default Field
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your DOB: ");
        String birthDate = sc.nextLine();
        System.out.print("Enter your hire-date: ");
        String hire = sc.nextLine();
        System.out.println("----------------");
        System.out.println("Please enter (y/n) to check your kind of work: ");
        String checkEmployee = sc.nextLine();
        //? Call Object
        Employee employee = new Employee(name, birthDate, hire);
        Employee secondEmployee = new Employee(name, birthDate, hire);
        Worker worker = new Worker();
        //? Display Default Field
        System.out.println(employee);
        System.out.println(secondEmployee);
//        System.out.println("Age = " + employee.getAge());
//        System.out.println("Pay = " + employee.collectPay());
        if (Objects.equals(checkEmployee, "y"))
        {
            System.out.print("Enter your salary: ");
            int salary = sc.nextInt();
            SalariedEmployee salariedEmp = new SalariedEmployee(name,birthDate,hire,salary);
            System.out.println("----------- You are Salaried Employee ----------");
            System.out.println(salariedEmp);
            System.out.println("Salary = " + salariedEmp.collectPay());
            salariedEmp.retire();
            System.out.println("Salary = " + salariedEmp.collectPay());
        }else if (Objects.equals(checkEmployee, "n"))
        {
            System.out.print("Enter your hourly-pay: ");
            int hourlyPay = sc.nextInt();
            HourlyEmployee hourlyEmp = new HourlyEmployee(name,birthDate,hire,hourlyPay);
            System.out.println("----------- You are Hourly Employee ----------");
            System.out.println(hourlyEmp);
            System.out.println("Hourly = " + hourlyEmp.collectPay());
            System.out.println("Holiday Pay = " + hourlyEmp.getDoublePay());
        }
    }
}
