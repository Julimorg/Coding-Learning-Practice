package JavaMasterClassCoursePractice.OOP_Inheritance.WallArea;

public class Main {
    public static void main(String[] args) {
        wallArea wallArea = new wallArea(4,5);
        System.out.println("area= " + wallArea.getArea());
        wallArea.setHeight(-1.5);
        System.out.println("width= " + wallArea.getWidth());
        System.out.println("height= " + wallArea.getHeight());
        System.out.println("area= " + wallArea.getArea());
    }

}
