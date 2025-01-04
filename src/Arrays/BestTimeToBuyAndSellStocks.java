package Arrays;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices= {7,1,5,3,6,4};
        int ans1= solution_brute(prices);
        System.out.println(ans1);
        int ans2 = solution(prices);
        System.out.println(ans2);
    }
    static int solution_brute(int[] prices){
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int diff = prices[j]- prices[i];
                profit = Math.max(profit,diff);
            }
        }
        return profit;
    }
    static int solution(int[] prices){
       int minPrice = Integer.MAX_VALUE;
       int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            profit = Math.max(profit, prices[i]-minPrice);
        }
        return profit;
    }
}
