package JavaMasterClassCoursePractice.Section9_Array;

import java.util.Arrays;
import java.util.Random;

public class Practice6 {
    public static void main(String[] args) {
        int[] unsortedArray = randomArr(5);
        System.out.println("-".repeat(50));
        System.out.println(Arrays.toString(unsortedArray));
        int[] sortedArray = sortArr(unsortedArray);
        System.out.println("-".repeat(50));
        System.out.println(Arrays.toString(sortedArray));

    }
    public static int[] randomArr(int len)
    {
        Random random = new Random();
        int[] arr = new int[len];
        for( int i = 0 ; i < len ; i++)
        {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
    //? Sort from highest to lowest
    public static int[] sortArr(int[] array)
    {
        int[] sortdArr = Arrays.copyOf(array, array.length);
        boolean flag = true; // Hardcore gắn cờ với giá trị được định trước
        int temp;
        while(flag) // Ở đây khi xong tác vụ vòng lặp flag = true thì end while loop
        {
            flag = false;
            for(int i = 0 ; i < array.length - 1; i++)
            {
                if(sortdArr[i] < sortdArr[i+1])
                {
                    temp = sortdArr[i];
                    sortdArr[i] = sortdArr[i+1];
                    sortdArr[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortdArr;
    }


}
