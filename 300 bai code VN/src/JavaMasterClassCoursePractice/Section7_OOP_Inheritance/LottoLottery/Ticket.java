package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.LottoLottery;

public class Ticket {
    private int ticket_price = 4;
    private int min = 1;
    private int max = 49;

    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int num6;

    public Ticket() {

    }
    public Ticket(int num1, int num2, int num3, int num4, int num5, int num6) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.num6 = num6;
    }
    public int getTicket_price() {
        return ticket_price;
    }
    public int getRandomNumber()
    {
        return 0;
    }
    public int equalTicket(Ticket otherTicket)
    {
        return 0;
    }


}
