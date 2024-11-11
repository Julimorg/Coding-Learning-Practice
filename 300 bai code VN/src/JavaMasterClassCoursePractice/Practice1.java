package JavaMasterClassCoursePractice;

import java.util.Scanner;

public class Practice1 {
    public static void displayHighScorePostion(String playerName, int playerPostition)
    {
        System.out.print(playerName + " managed to get into position" + playerPostition + " on the high score list");
    }
    public static int calculatedHighScorePosition(int playerScore)
    {
        if ( playerScore >= 1000)
        {
            return 1;
        }else if ( playerScore >= 500 || playerScore <= 1000)
        {
            return 2;
        }else if ( playerScore >= 100 || playerScore <= 500)
        {
            return 3;
        }else
        {
            return 4;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int displaySCore = calculatedHighScorePosition(a);
        displayHighScorePostion("Fong", displaySCore);
    }
}
