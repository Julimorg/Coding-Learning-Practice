package JavaMasterClassCoursePractice.Section9_Array;

import java.util.Arrays;
import java.util.Random;

public class Practice3 {

    public static void main(String[] args) {
       int[] randomArr = getRandomArray(10);
       System.out.println("-".repeat(50));
       System.out.println(Arrays.toString(randomArr));

        System.out.println("-".repeat(50));
        Arrays.sort(randomArr);
        System.out.println(Arrays.toString(randomArr));

        System.out.println("-".repeat(50));
        int[] secondArr = new int[10];
        System.out.println(Arrays.toString(secondArr));
        Arrays.fill(secondArr, 5);
        System.out.println(Arrays.toString(secondArr));

        System.out.println("-".repeat(50));
        int[] thirdArr = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArr));

        System.out.println("-".repeat(50));
        int[] fourthArr = Arrays.copyOf(randomArr, 20);
        System.out.println(Arrays.toString(fourthArr));

    }
    public static int[] getRandomArray(int len)
    {
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0 ; i < len; i++)
        {
            newInt[i] = random.nextInt(10);
        }
        return newInt;
    }

}
