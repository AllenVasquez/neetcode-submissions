class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int p=0;
        int r=1;
        while(r<prices.length){
            if(prices[r]<prices[l]){
                l=r;
                r++;
            }else{
                if(p<prices[r]-prices[l]){
                    p=prices[r]-prices[l];
                }
                r++;
            }
        }
        return p;
    }
}
