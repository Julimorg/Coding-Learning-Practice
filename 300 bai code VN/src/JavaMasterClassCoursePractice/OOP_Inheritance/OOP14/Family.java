package JavaMasterClassCoursePractice.OOP_Inheritance.OOP14;

public class Family {
    private String familyName;
    private double avgAg;
    private String gender;
    private int generation;
    public Family()
    {

    }
    public Family(String familyName, double avgAg, String gender, int generation) {
        this.familyName = familyName;
        this.avgAg = avgAg;
        this.gender = gender;
        this.generation = generation;
    }

    @Override
    public String toString() {
        return "Family{" +
                "familyName='" + familyName + '\'' +
                ", avgAg=" + avgAg +
                ", gender='" + gender + '\'' +
                ", generation=" + generation +
                '}';
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAvgAg() {
        return avgAg;
    }

    public void setAvgAg(double avgAg) {
        this.avgAg = avgAg;
    }
}
