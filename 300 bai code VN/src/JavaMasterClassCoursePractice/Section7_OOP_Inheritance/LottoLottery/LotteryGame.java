package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.LottoLottery;

public class LotteryGame {
    private int reward_two_matches = 10;
    private int reward_three_matches = 100;
    private int reward_four_matches = 1000;
    private int reward_five_matches = 5000;
    private int reward_six_matches = 5000000;
    private int noGameWon;
    private int noGameWon5;
    private int totalReward;
    private int totalTicketCost;
    private Ticket winingTicket;

    public LotteryGame() {

    }
    public Ticket getWiningTicket() {
        return winingTicket;
    }
    public int getReward(int Reward)
    {
        return 0;
    }

    public static void main(String[] args) {

    }

}
