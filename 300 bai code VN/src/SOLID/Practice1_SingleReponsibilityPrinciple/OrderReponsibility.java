package SOLID.Practice1_SingleReponsibilityPrinciple;

public class OrderReponsibility {
    public void saveToDb(Order order){
        System.out.println("Saving order: " + order.getOrderId() + "to DB") ;
    }
}
