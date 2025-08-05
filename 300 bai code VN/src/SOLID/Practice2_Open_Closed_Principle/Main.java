package SOLID.Practice2_Open_Closed_Principle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input distance: ");
        double distance = sc.nextDouble();

        System.out.println("Motocycle: ");
        Motocycle motocycle = new Motocycle();
        System.out.println(motocycle.calculateCost(distance));

        System.out.println("Truck: ");
        Truck truck = new Truck();
        System.out.println(truck.calculateCost(distance));

    }
}
