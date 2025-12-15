//   LeetCode 70 — Climbing Stairs
//   --------------------------------
//   You are climbing a staircase. It takes n steps to reach the top.
//   Each time you can either climb 1 or 2 steps.
//   Return the number of distinct ways to reach the top.


package maths;
import java.util.Scanner;

public class climbingStairs {

    public static int climbStairs(int n) {
        if (n == 1) return 1;

        int first = 1, second = 2;

        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();

        int result = climbStairs(n);
        System.out.println("Ways to climb stairs: " + result);

        sc.close();
    }
}
