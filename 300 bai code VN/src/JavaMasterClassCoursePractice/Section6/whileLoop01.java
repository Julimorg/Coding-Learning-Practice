package JavaMasterClassCoursePractice.Section6;

public class whileLoop01 {

    public static int whileLoop(int num)
    {
        int i = 0;
        while(i <= num)
        {
            System.out.print(i);
            i++;
        }
        return i;
    }
    public static int doWhileLoop(int num)
    {
        int i = 1;
        do{
            System.out.print(i);
            i++;
        }while( i < num);
        return i;
    }
    public static void continueStatement()
    {
        int number  = 0;
        while(number < 50)
        {
            number += 5;
            if ( number % 25 == 0)
            {
                continue;
            }
            System.out.print(number + "_");
        }
    }


    public static void main(String[] args) {
        System.out.print(whileLoop(1));
        System.out.print("\n");
        System.out.print(doWhileLoop(1));
        System.out.print("\n");
        continueStatement();
    }
}
