package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.OOP18;

public class Rectangle03 extends Shape{
    private int width;
    private int height;
    public Rectangle03(int x, int y) {
        this(x,y,0,0);
    }

    public Rectangle03(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;

    }
}
