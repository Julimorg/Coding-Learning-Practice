package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.OOP1_Composition;

public class Main {
    public static void main(String[] args) {
        ComputerCase thecase = new ComputerCase("2208", "Dell","240");

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27,"2540 x 1440");

        MotherBoard theMotherBoard = new MotherBoard("BJ-200","Asus", 4,6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208","Dell", thecase, theMonitor, theMotherBoard);

//        thePC.getMonitor().drawPixelAt(10,10 ,"red");
//        thePC.getMotherboard().loadProgram("Window OS");
//        thePC.getComputerCase().pressPowerButton();
        thePC.powerUp();

    }
}
