package JavaMasterClassCoursePractice.OOP_Inheritance.WallArea;

public class wallArea {
    private double height;
    private double width;

    public wallArea() {
    }
    public wallArea(double height, double width) {
        this.height = height;
        this.width = width;

    }
    public double getWidth() {
       if(this.width < 0 )
       {
           return width = 0;
       }
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        if(this.height < 0 )
        {
            return height = 0;
        }
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
}
