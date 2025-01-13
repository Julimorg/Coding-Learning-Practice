package JavaMasterClassCoursePractice.Section7_OOP_Inheritance;

public class StringFormatting {
    public static void main(String[] args) {
        printInformation("Hello Worrld");
        printInformation(" ");
        printInformation("\t  \n");

        String helloworld = "Hello World";
        System.out.printf("index of r =  %d %n",helloworld.indexOf('r'));
        System.out.printf("index of World =  %d %n",helloworld.indexOf("World"));
        System.out.printf("index of l =  %d %n",helloworld.indexOf('l'));
        System.out.printf("index of l =  %d %n",helloworld.lastIndexOf('r'));
        System.out.printf("index of l =  %d %n",helloworld.indexOf('r',10));



    }
    public static void printInformation(String string)
    {
        int length = string.length();
        if (string.isEmpty())
        {
            System.out.println("Empty String");
            return;
        }
        if(string.isBlank())
        {
            System.out.println("Blank String");
            return;
        }
        System.out.printf("Length = %d %n", length);
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char =%c %n", string.charAt(length - 1));

    }
}
