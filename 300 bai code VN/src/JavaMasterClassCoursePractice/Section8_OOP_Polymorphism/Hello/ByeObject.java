package JavaMasterClassCoursePractice.Section8_OOP_Polymorphism.Hello;

public class ByeObject extends  HelloObject{

    public ByeObject(String name){
        super(name);
    }

    public void bye(){
        System.out.println("Bye");
    }

}
