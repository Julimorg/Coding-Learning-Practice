package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.OOP8;

public class Main {
    public static void main(String[] args) {
//        Student std = new Student();

        for(int i = 1; i <= 5; i++)
        {
            Student std = new Student(
                    "31313" + i,
                    switch(i)
                    {
                        case 1 -> "Jian";
                        case 2 -> "dq";
                        case 3 -> "d1q";
                        case 4 -> "e1";
                        case 5 -> "e1q";
                        default -> "UN";
                    },
                    "31/31/2003",
                    "Java Master Class"
                    );
            System.out.println(std);
        }
    }
}
