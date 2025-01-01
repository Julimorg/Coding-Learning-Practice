package JavaMasterClassCoursePractice.OOP_Inheritance.OOP12;

public class Animal {
    private String type;
    private String size;
    private double weight;

    public Animal(String type, double weight, String size) {
        this.type = type;
        this.weight = weight;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void move( String speed)
    {
        System.out.println(type + " moves " + speed);
    }
    public void makeNoise()
    {
        System.out.println(type + " makes noise");
    }
}
