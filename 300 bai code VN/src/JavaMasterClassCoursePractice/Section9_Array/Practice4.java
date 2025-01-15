package JavaMasterClassCoursePractice.Section9_Array;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {
        String[] strArr = {"Chen","Jian","Fong","Fong","Tran"};
        int[] num1 = {5,12,41,41,1,2,4,1,51};
        int[] num2 = {31,1,2,4,1,2,3,1,4,1,5};
        Arrays.sort(strArr);
        Arrays.sort(num1);
        Arrays.sort(num2);
        System.out.println(Arrays.toString(strArr));
        System.out.println("-".repeat(50));
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        try{
            if( Arrays.binarySearch(strArr,"Fong") >= 0)
            {
             System.out.println("Valid");
            }
            if(Arrays.equals(num1,num2))
            {
                System.out.println("Equal");
            }else
            {
                System.out.println("Not Equal");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
