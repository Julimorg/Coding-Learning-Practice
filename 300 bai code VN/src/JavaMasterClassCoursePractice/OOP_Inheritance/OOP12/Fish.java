package JavaMasterClassCoursePractice.OOP_Inheritance.OOP12;

public class Fish extends Animal{
    private int fins;
    private int gills;

    public Fish(String type, double weight, int fins, int gills) {
        super(type, weight, "small");
        this.fins = fins;
        this.gills = gills;
    }

    public void moveMuscles()
    {
        System.out.print("Muscles moved ");
    }
    public void moveBackFins()
    {
        System.out.print("Back Fins moved ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast")
        {
            moveBackFins();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
