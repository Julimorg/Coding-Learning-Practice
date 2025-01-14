package JavaMasterClassCoursePractice.StringFormatting;

import java.util.LinkedList;

public class StringBuilderFormattng {
    public static void main(String[] args) {

        String helloWorld =  "Hello" + "World";
        String full = helloWorld.concat("and GoodBye");
        StringBuilder helloWorldBuilder = new StringBuilder("Hello " + "World");
        helloWorldBuilder.append("and GoodBye");
        printInformation(full);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyEnd = new StringBuilder(32);

        printInformation(emptyStart);
        printInformation(emptyEnd);
    }
    public static void printInformation(String string)
    {
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder builder)
    {
        System.out.println("String = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("Capacity = " + builder.capacity());
    }




}
