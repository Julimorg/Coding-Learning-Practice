package JavaMasterClassCoursePractice.Section6;

public class loopPractice_01 {
    public static void main(String[] args) {
        for(double rate = 2.0 ; rate <= 5.0 ; rate++)
        {
            double interesAmount = calculateInterest(10000.0, rate);
            System.out.println(" 10,000 at " + rate + " % interest = " + interesAmount);
        }

    }
    public static double calculateInterest(double amonunt, double interest)
    {
        return (amonunt *( interest / 100 ));
    }

}
