package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.OOP3_Composition;

public class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }
    public int getHeight(){
        return height;
    }
    public int getPaintedColor(){
        return paintedColor;
    }
}
