package SOLID.Practice2_Open_Closed_Principle;

public class Truck implements Transport{
    @Override
    public double calculateCost(double distance) {
        return distance * 10;
    }
}
