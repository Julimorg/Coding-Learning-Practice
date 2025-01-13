package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.OOP7;

public class Dog {
    static String genus = "Canis";
    static void printData()
    {
        Dog d = new Dog();
        System.out.print(Dog.genus);
    }
    public static void main(String[] args) {
       printData();
    }

}
