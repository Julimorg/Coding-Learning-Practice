package JavaMasterClassCoursePractice.Section9_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice6_SortFromLowToHigh_BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your length of array: ");
        int n = sc.nextInt();
        int[] getNum = getInteger(n);
        int[] sortArray = bubbleSortLowToHigh(getNum);
        System.out.println("-".repeat(50));

        displayArray(sortArray);

    }
    public static int[] getInteger(int size)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        for( int i = 0 ; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void displayArray(int[] array)
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Element" + " " + i + " contents" + " " + array[i]);
        }
    }
    public static int[] bubbleSortLowToHigh(int[] array)
    {
        int[] sortdArr = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag)
        {
            flag = false;
            for(int  i = 0 ; i < array.length - 1 ; i++)
            {
                if ( array[i] > array[i+1] )
                {
                    temp = array[i] ;
                    array[i+1] = array[i] ;
                    temp = array[i+1] ;
                    flag = true;
                }
            }
        }
        return sortdArr;
    }
}
