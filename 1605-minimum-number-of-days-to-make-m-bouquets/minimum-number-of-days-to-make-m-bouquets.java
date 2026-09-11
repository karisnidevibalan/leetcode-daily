class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int l=1;
        int h=0;
        for(int i:bloomDay){
            h=Math.max(h,i);
        }
        int res=0;
        while(l<=h){
            int mid=l+(h-l)/2;
           if(canget(bloomDay,m,k,mid)){
            h=mid-1;
            res=mid;
           }
           else{
            l=mid+1;
           }
        }
        return res;
    }
    private boolean canget(int[] bloomDay,int m,int k,int mid){
        int bouquets=0;
        int adjflowers=0;
        for(int i:bloomDay){
            if(i<=mid){
                adjflowers++;
            
            if(adjflowers==k){
                bouquets++;
                adjflowers=0;
            }

            }
            else{
                adjflowers=0;
            }
            if(bouquets>=m){
                return true;
            }


        }
        return false;
    }
}