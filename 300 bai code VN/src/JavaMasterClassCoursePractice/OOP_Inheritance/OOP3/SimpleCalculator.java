package JavaMasterClassCoursePractice.OOP_Inheritance.OOP3;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult()
    {
        double add = firstNumber + secondNumber;
        return add;
    }
    public double getSubtractionResult()
    {
        double subtract = firstNumber - secondNumber;
        return subtract;
    }
    public double getMultiplicationResult()
    {
        double multi = firstNumber * secondNumber;
        return multi;
    }
    public double getDivisionResult()
    {
        double  div = 0;
        if ( secondNumber != 0 )
        {
            div = firstNumber / secondNumber;
        }else return 0;
        return div;
    }

}
