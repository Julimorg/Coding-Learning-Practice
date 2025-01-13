package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.OOP18;

public class Rectangle02 {
    private int x;
    private int y;
    private int width;
    private int height;

    //* CONSTRUCTOR CHAINING TEQ
    //? Constructor này sẽ call từ constructor thứ 2
    public Rectangle02()
    {
        this(0,0);
    }
    //? Constructor này sẽ call từ constructor thứ 3
    public Rectangle02(int width, int height)
    {
        this(0,0,width,height);
    }
    //? Constructor với parameter
    public Rectangle02(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}
