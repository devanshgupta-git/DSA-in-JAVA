package arrays;
import java.util.Arrays;

public class MedianOfTwoSortedArrays4 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int length = m + n;
        int[] arr = new int[length];

        for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            arr[m + i] = nums2[i];
        }

        Arrays.sort(arr);

        if (length % 2 == 0) {
            return (arr[length / 2 - 1] + arr[length / 2]) / 2.0;
        } else {
            return arr[length / 2];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        System.out.println(findMedianSortedArrays(nums1, nums2)); 
    }
}
