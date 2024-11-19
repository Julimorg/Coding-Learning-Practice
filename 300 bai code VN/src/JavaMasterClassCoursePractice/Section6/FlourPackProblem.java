package JavaMasterClassCoursePractice.Section6;

import java.util.Scanner;

public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // Kiểm tra nếu bất kỳ tham số nào là âm
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        // Số lượng tối đa túi lớn có thể sử dụng
        int maxBigBags = goal / 5;

        // Sử dụng túi lớn, nhưng không vượt quá số lượng bigCount có sẵn
        int bigBagsToUse = Math.min(maxBigBags, bigCount);

        // Tính số kg còn lại sau khi sử dụng túi lớn
        int remainingGoal = goal - (bigBagsToUse * 5);

        // Kiểm tra nếu số túi nhỏ đủ để đạt được mục tiêu
        return remainingGoal <= smallCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(canPack(a, b, c));
    }
}
