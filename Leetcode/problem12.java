package Leetcode;

public class problem12 {

    public static int maxProfit(int prices[]){
        int n = prices.length;
        int profit = 0;
        int min = prices[0];
        for(int i=0; i < n; i++){
            if(prices[i] < min){
                min = prices[i];
            }
             profit = Math.max(profit,prices[i]-min);
        }
        return profit;
    
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
       int res = maxProfit(prices);
       System.out.println(res);
    }
}
