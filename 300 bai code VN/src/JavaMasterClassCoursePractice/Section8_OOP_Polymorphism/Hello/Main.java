package JavaMasterClassCoursePractice.Section8_OOP_Polymorphism.Hello;

public class Main {
    public static void main(String[] args) {
        ByeObject bye = new ByeObject("Fong");
        HelloObject hello = bye;
        hello.Hello();
        System.out.println(hello);
    }
}
