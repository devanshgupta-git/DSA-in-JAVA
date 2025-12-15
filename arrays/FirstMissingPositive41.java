package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FirstMissingPositive41  {
     public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int missingNumber = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == missingNumber) {
                missingNumber++;
            } else if (nums[i] < missingNumber) {
                continue;
            } else {
                return missingNumber;
            }
        }
        return missingNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("First Missing Positive: " + firstMissingPositive(nums));
        sc.close();
    }
}
