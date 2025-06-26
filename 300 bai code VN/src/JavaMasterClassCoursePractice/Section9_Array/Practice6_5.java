package JavaMasterClassCoursePractice.Section9_Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice6_5 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int leng = sc.nextInt();
            System.out.print(Arrays.toString(getRandomArray(leng)));
    }
//    public static int[] sortIntegers(int[] array){
//
//    }
    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] randomArray = new int[len];
        for(int i = 0 ; i < len ; i++){
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }
}
