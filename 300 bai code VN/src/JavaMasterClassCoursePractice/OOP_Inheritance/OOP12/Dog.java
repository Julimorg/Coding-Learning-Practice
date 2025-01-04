package JavaMasterClassCoursePractice.OOP_Inheritance.OOP12;

public class Dog extends Animal{
    private String earShape;
    private String tailShape;
    public Dog()
    {
        super("Ben",400,"Big"); // Cần call tới Constructor default của Dog
    }
    public Dog(String type, double weight)
    {
        this(type,weight,"Perky", "Curled");
    }
    public Dog(String type, double weight,String tailShape, String earShape) {
        super(type, weight, weight < 15 ? "Small" : (weight < 35 ? "Medium" : "Large"));
        this.tailShape = tailShape;
        this.earShape = earShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
    @Override
    public void makeNoise()
    {

    }
    @Override
    public void move(String speed)
    {
        super.move(speed);
        System.out.println("Dog walks, run and wag their tails");
    }
    void bark()
    {

    }
    void run()
    {

    }
    void walk()
    {

    }
    void wagTail()
    {

    }



}
