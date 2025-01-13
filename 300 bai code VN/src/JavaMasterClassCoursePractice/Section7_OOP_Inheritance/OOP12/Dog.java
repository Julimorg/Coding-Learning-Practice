package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.OOP12;

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
        if(type == "Wolf")
        {
            System.out.println("Wolf");
        }
        bark();
        System.out.println();
    }
    @Override
    public void move(String speed)
    {
        super.move(speed);
//        System.out.println("Dog walks, run and wag their tails");
        if(speed == "slow")
        {
            walk();
            wagTail();
        }else
        {
            run();
            bark();
        }
        System.out.println();
    }
    private void bark()
    {
        System.out.print("Bark!");
    }
    private void run()
    {
        System.out.print("Running");
    }
    private void walk()
    {
        System.out.print("Woof!");
    }
    private void wagTail()
    {
        System.out.print("Tail!");
    }



}
