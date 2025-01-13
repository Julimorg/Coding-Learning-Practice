package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.CircleCylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        Circle circle = new Circle(radius,color);
        Cylinder cylinder = new Cylinder(radius,color, height);
        System.out.println("--------------");
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println("--------------");
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());

    }
}
