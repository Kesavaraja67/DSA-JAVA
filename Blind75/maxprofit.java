public class maxprofit {
    public static void main(String[] args){
        int[] nums = {7, 1, 5, 3, 6, 4};
        int maximum_profit = maxprofit(nums);
        System.out.println(maximum_profit);
    }
    public static int maxprofit(int[] prices){
        int profit = 0;
        int buy = 0;
        int sell = 1;

        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(profit, prices[sell] - prices[buy]);
            if(prices[sell] < prices[buy]){
                buy = sell;
            }
            sell ++;
        }
        return profit;
    }
}
