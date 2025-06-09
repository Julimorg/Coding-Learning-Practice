package JavaMasterClassCoursePractice.Section8_OOP_Polymorphism.Hello;

public class HelloObject {
    private String name;
    public HelloObject(String name) {
        this.name = name;
    }
    public void Hello(){
        System.out.println("Hello " + name);
    }
}
