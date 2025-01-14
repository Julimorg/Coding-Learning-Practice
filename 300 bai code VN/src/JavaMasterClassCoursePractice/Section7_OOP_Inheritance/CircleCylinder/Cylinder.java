package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.CircleCylinder;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "} " + super.toString();
    }

    public double getVolume()
    {
        return getArea() * height;
    }

}
