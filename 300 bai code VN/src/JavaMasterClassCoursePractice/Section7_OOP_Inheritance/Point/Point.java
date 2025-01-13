package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.Point;

public class Point {
    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public double distance(int x, int y) {

        int pointX = this.x - x;
        int pointY = this.y - y;
        return Math.sqrt(pointX * pointX + pointY * pointY);
    }
    public double distance()
    {
        return distance(0,0);
    }
    public double distance(Point a) {
        return distance(a.x, a.y);
    }

}
