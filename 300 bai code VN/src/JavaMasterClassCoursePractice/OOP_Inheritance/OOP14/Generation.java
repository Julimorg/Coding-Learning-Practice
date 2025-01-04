package JavaMasterClassCoursePractice.OOP_Inheritance.OOP14;

public class Generation extends Family{
    private String generationName;
    private double avgAge;
    private int people;
    public Generation()
    {
        super("Van Dinh", 40 , "Male" , 13);
    }

    public Generation(String familyName, double avgAg, String gender, int generation, double avgAge, String generationName, int people) {
        super(familyName, avgAg, gender, generation);
        this.avgAge = avgAge;
        this.generationName = generationName;
        this.people = people;
    }

    @Override
    public String toString() {
        return "Generation{" +
                "generationName='" + generationName + '\'' +
                ", avgAge=" + avgAge +
                ", people=" + people +
                "} " + super.toString();
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public double getAvgAge() {
        return avgAge;
    }

    public void setAvgAge(double avgAge) {
        this.avgAge = avgAge;
    }

    public String getGenerationName() {
        return generationName;
    }

    public void setGenerationName(String generationName) {
        this.generationName = generationName;
    }
}
