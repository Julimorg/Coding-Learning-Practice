package JavaMasterClassCoursePractice.Section9_Array;

public class Practice9 {
    public static void main(String... args) {
        System.out.println("Hello World");

        String[] splitStrings = "Hello World Again".split(" ");
        printText(splitStrings );
        System.out.printf("-".repeat(50));
        printText("hello");
        System.out.printf("-".repeat(50));
        printText("Hello","World","Again");
        printText();
        String[] arr = {"first", "second", "third"};
        System.out.printf(String.join(",", arr));

    }
    private static void printText(String... textlist)
    {
        for(String t : textlist)
        {
            System.out.println(t);
        }
    }

}
