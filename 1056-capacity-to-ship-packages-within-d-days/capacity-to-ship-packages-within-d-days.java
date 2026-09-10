class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0;
        int h=0;
        int res=0;
        for(int i:weights){
            l=Math.max(i,l);
            h+=i;
            
        }
        int total=h;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(canhold(weights,days,mid)){
                h=mid-1;
                res=mid;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }
    private boolean canhold(int[] weights,int days,int capacity){
        int daysneeded=1;
        int load=0;
        for(int i:weights){
            if(i+load>capacity){
             daysneeded++;
             load=0;
            }
            load+=i;
        }
        return daysneeded<=days;
    }
}