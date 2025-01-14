package JavaMasterClassCoursePractice.Section9_Array;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        for(int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        System.out.println("-".repeat(50));

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("first =  " + firstTen[9]);
        int arrLength = firstTen.length;
        System.out.println("Length of array = " + arrLength);
        System.out.println("-".repeat(50));
        int[] newArr;
        newArr = new int[5];
        String[] stringArr = {"Chen","Jian","Fong"};
        for(int i = 0 ; i <  newArr.length ; i++) {
            newArr[i] = newArr.length - i;
        }
        for(int i = 0 ; i < newArr.length ; i++) {
            System.out.println(newArr[i]);
        }
        System.out.println("-".repeat(50) );
        for(int element : newArr)
        {
            System.out.println(element + "");
        }
        System.out.println("-".repeat(50) );
        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(stringArr));
        System.out.println("-".repeat(50) );
        Object objectVariable = newArr;
        if ( objectVariable instanceof int[])
        {
            System.out.println("ObjectVariable is really an int arry");
        }
        System.out.println("-".repeat(50) );
        Object[] objectArr = new Object[4];
        objectArr[0] = "Chen";
        objectArr[1] = new StringBuilder("Fong");
        objectArr[2] = 1;
        objectArr[3] = newArr[3];
        System.out.println(Arrays.toString(objectArr));
    }
}
