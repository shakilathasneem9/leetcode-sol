class Solution {
    public int maxProfit(int[] prices) {
        int min_price=Integer.MAX_VALUE;
        int max_profit=0;
        for(int p:prices){
            if(p<min_price){
                min_price=p;
            }
            if(p-min_price>max_profit){
            max_profit=p-min_price;
            }
        }
        
        return max_profit;
    }
}
//7 1 5 3 6 4 
//.p
//min_price=7
//max profit=0
//7 1 5 3 6 4 
//. p
//min_price=1
//max profit=0
//check if 1<0? no check if 1-1>0 no so 
//7 1 5 3 6 4
//.   p
//min_price=1
//max=0
//check if 5<0 no so check next 5-1>0 yes so max=4 like this finding max output