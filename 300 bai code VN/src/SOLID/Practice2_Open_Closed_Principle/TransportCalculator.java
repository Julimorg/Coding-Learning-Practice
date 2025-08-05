package SOLID.Practice2_Open_Closed_Principle;

public class TransportCalculator {
    public double calculateCost(Transport transport, double distance) {
        return transport.calculateCost(distance);
    }
}
