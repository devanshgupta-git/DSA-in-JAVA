package binarySearch;

import java.util.Scanner;

// Simulates LeetCode's GuessGame API
class GuessGame {
    private int pick;

    public GuessGame(int pick) {
        this.pick = pick;
    }

    int guess(int num) {
        if (num > pick) return -1;
        if (num < pick) return 1;
        return 0;
    }
}

public class GuessNumberHigherOrLower374 extends GuessGame {

    public GuessNumberHigherOrLower374(int pick) {
        super(pick);
    }

    public int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int res = guess(mid);

            if (res == 0) return mid;
            else if (res == -1) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter picked number: ");
        int pick = sc.nextInt();

        GuessNumberHigherOrLower374 obj =
                new GuessNumberHigherOrLower374(pick);

        System.out.println("Guessed Number: " + obj.guessNumber(n));
        sc.close();
    }
}

