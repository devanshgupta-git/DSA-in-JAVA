package arrays;

public class majorityElement169 {

    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        majorityElement169 solution = new majorityElement169();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(solution.majorityElement(nums)); 
    }
}
