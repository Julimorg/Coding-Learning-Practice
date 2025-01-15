package JavaMasterClassCoursePractice.Section9_Array;

import java.util.Arrays;

public class Practice8 {
    public static void main(String[] args) {
       int[] myIntArray = new int[5];
       int[] anotherIntArray = myIntArray;
       System.out.println("myIntArray = " + Arrays.toString(myIntArray));
       System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));
       anotherIntArray[0] = 1;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));

    }
}
