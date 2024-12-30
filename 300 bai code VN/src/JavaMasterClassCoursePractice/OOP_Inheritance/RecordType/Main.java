package JavaMasterClassCoursePractice.OOP_Inheritance.RecordType;

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++)
        {
            LPAStudent std = new LPAStudent(
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
        Student pojoStudent = new Student("5121","Fong", "13/12/1213","dqwdqdqw");
        LPAStudent recordStudent = new LPAStudent("5919","Bill","31/11/1313","3ek13");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);
    }
}
