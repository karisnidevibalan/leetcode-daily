class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int high=0;
        
        for(int p:piles){
            high=Math.max(high,p);
        }
        int result=high;
        while(l<=high){
            int k=l+(high-l)/2;
            long totalhr=0;
           for(int p:piles){
             totalhr+=(p+k-1)/k;
           }
           if(totalhr<=h){
            result=k;
            high=k-1;
           }
           else{
            l=k+1;
           }
        }
        return result;
    }
}