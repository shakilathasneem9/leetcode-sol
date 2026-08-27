class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                max_profit+=prices[i]-prices[i-1];
            }
        }
        return max_profit;
    }
}
//T O(n)
//[7 1 5 3 6 4 ]
//.  i
//mp
//[7 1 5 3 6 4]
//.    i
//mp=5-1=4
//[7 1 5 3 6 4]
//.      i here value is less so move next
//mp=4
//[7 1 5 3 6 4]
//.        i
//mp=6-3=3
//there for mex profit is 4+3=7