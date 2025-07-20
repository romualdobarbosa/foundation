import java.util.Arrays;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minimo = Integer.MAX_VALUE;
        int ans = 0;

        for (int i = 0; i < prices.length; i++) {
            minimo = Math.min(minimo, prices[i]);

            if (minimo <= prices[i]) {
                ans = prices[i] - minimo;
            }
        }
        return ans;
    }
}
