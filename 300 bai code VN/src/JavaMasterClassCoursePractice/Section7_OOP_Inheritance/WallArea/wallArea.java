package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.WallArea;

public class wallArea {
    private double height;
    private double width;

    public wallArea() {
    }
    public wallArea(double width, double height) {
        setWidth(width);
        setHeight(height);

    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            width = 0;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
}
