package greedy;

public class maxProfit121 {

    public static int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxSell = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minBuy) {
                minBuy = prices[i];
            } else {
                maxSell = Math.max(maxSell, prices[i] - minBuy);
            }
        }
        return maxSell;
    }

    // main method for VS Code execution
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int profit = maxProfit(prices);
        System.out.println("Maximum Profit: " + profit);
    }
}
