package JavaMasterClassCoursePractice.Section9_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        for(int i = 0 ;i<=n;i++)
        {
            System.out.printf("A[%d]\n",i);
        }
        System.out.println("-".repeat(20));
        int arr[] = {1,2,3,4,5,5,6,3,1,4};
        System.out.println(Arrays.toString(arr));
        System.out.println("-".repeat(20));
        String stringArr[] = {"Chen","Jian", "Fong"};
        System.out.println(Arrays.toString(stringArr));
        System.out.println("-".repeat(20));
        Object[] myObject = new Object[4];
        myObject[0] = "1";
        myObject[1] = "2";
        myObject[2] = arr[4];
        myObject[3] = stringArr[2];
        System.out.println(Arrays.toString(myObject));
    }
}
