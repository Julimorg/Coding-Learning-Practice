package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.Cylinder2;

public class Circle {
    private double radius;
    public Circle(double radius)
    {
        if (radius < 0)
        {
            radius = 0;
        }
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
