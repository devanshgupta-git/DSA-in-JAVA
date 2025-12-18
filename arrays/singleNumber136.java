package arrays;

public class singleNumber136 {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;    // XOR of different digits = 1 and same digits = 0 and XOR of num^0  = num
        }
        return result;
    }

    // For running in VS Code
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int ans = singleNumber(nums);
        System.out.println("Single number is: " + ans);
    }
}

