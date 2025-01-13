package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.OOP13;

public class Bicycle extends  Car{
    int speed = 50;
    Bicycle()
    {
        super();
        System.out.println("Xe đạp được tạo");
    }
   public void display()
    {
        System.out.println(super.speed);
    }
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.display();
    }
}
