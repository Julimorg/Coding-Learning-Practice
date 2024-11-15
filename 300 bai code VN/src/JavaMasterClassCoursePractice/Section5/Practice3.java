package JavaMasterClassCoursePractice.Section5;

public class Practice3 {
    public static int calculateScore (String playerName, int score )
    {
        System.out.print( "" + playerName + " " +score);
        return score  * 1000;
    }
//**    Method Overloading
    public static int calculateScore (int score)
    {
        System.out.print( "Unknowed player"  +score);
        return score  * 1000;
    }
    public static String calculateScore(String playerName)
    {
//        System.out.print( "" + playerName);
        return playerName;
    }

    public static int calculateScore ()
    {
        System.out.print("is Empty ");
        return 0;
    }


    public static void main(String[] args) {
            //? Method 1
            int newScore = calculateScore("Harry Potter", 20);
            System.out.print("\n");
            System.out.println("Harry Potter is " + newScore);

        //? Method 2
            int newScore2 = calculateScore(40);
        System.out.print("\n");
        System.out.println("Harry Potter is " + newScore2);
        calculateScore();
        System.out.print("\n");
        System.out.println(calculateScore("Fong"));
    }
}
