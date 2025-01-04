package JavaMasterClassCoursePractice.OOP_Inheritance.ComplexOperations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //? Input field 1
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("--------------");
        //? Input field 2
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        ComplexNumber one = new ComplexNumber( a , b);
        ComplexNumber number = new ComplexNumber(c , d);
        one.add(a,b);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
