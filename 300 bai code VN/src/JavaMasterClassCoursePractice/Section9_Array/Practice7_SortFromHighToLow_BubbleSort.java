package JavaMasterClassCoursePractice.Section9_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice7_SortFromHighToLow_BubbleSort {
    public static void main(String[] args) {
       int[] getArray = getInteger(5);

       printArray(sortArray(getArray));

    }
    public static int[] getInteger(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Enter " + size + " integer values:\r");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] array)
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Element" + " " + i + " contents" + " " + array[i]);
        }
    }
    public static int[] sortArray(int[] array)
    {
        int[] sortdArr = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag)
        {
            flag = false;
            for( int i = 0; i < array.length - 1; i++)
            {
                if( sortdArr[i] < sortdArr[i+1])
                {
                    temp = sortdArr[i];
                    sortdArr[i] = sortdArr[i + 1];
                    sortdArr[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortdArr;
    }

}
