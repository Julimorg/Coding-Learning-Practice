package JavaMasterClassCoursePractice.Section8.OOP.Encapsulation.Challange107;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100 ) ? tonerLevel : 1;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public boolean getDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        int tempAmount = tonerAmount + tonerLevel;
        if (tempAmount > 100 || tempAmount < 0){
            return -1;
        }
        tonerLevel += tonerAmount;

        return tonerLevel;
    }

    public int printPages(int pages){
        int jobPages = (duplex) ? (pages / 2) + (pages % 2 ): pages;
        pagesPrinted += jobPages;
        return jobPages;
    }
}
