package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.OOP6;

public class Main {
    public static void main(String[] args) {
        House blueHouse = new House("blue");
        blueHouse.setAddress("dqwin ijdnqwind dnqiwndq street");
        blueHouse.setNumber(10);
        House anotherHouse =  blueHouse;
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());
        System.out.println(anotherHouse.getNumber());
        System.out.println(anotherHouse.getAddress());

//        anotherHouse.setColor("red");
//        anotherHouse.setNumber(20);
//        anotherHouse.setAddress("NguyenTrai Street");
//        System.out.println(anotherHouse.getColor());
//        System.out.println(blueHouse.getColor());
//        System.out.println(anotherHouse.getNumber());
//        System.out.println(anotherHouse.  getAddress());

        House greenHouse = new House("green");
        anotherHouse = greenHouse;
        System.out.println(anotherHouse.getColor());
        System.out.println(greenHouse.getColor());
        System.out.println(blueHouse.getColor());
    }


}
