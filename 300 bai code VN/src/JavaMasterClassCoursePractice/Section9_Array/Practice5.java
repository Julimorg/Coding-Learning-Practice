package JavaMasterClassCoursePractice.Section9_Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Practice5 {

    public static void main(String[] args) {
        int[] arr = {50,25,80,5,15,8};
        String[] strArr = {"dqw","w11","dwdq","d1wdwd","e1ecqw"};
        Object[] objects = new Object[]{31,"13",31.41 ,"edwqwd", "e1",1414};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(objects));
        System.out.println("-".repeat(50));
        Arrays.sort(arr);
        Arrays.sort(strArr);
//        Arrays.sort(objects);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(strArr));
//        System.out.println(Arrays.toString(objects));
        System.out.println("-".repeat(50));
        for(int i = 0 ; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for(int i = 0 ; i < strArr.length / 2; i++){
            String temp = strArr[i];
            strArr[i] = strArr[strArr.length - i - 1];
            strArr[strArr.length - i - 1] = temp;
        }
        for(int i = 0 ; i < objects.length / 2; i++){
            Object temp = objects[i];
            objects[i] = objects[objects.length - i - 1];
            objects[objects.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(objects));
    }

}
