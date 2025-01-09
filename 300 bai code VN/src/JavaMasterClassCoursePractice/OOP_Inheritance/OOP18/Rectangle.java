package JavaMasterClassCoursePractice.OOP_Inheritance.OOP18;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle()
    {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
