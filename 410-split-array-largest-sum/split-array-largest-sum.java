class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0;
        int h=0;

        for(int i:nums){
            l=Math.max(i,l);
            h+=i;
        }
        int res=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(cansplit(nums,k,mid)){
                h=mid-1;
                res=mid;
            }
            else{
              l=mid+1;
            }
        }
        return res;
    }
    private boolean cansplit(int[] nums,int k,int mid){
        int currsum=0;
        int subarraycount=1;
        for(int i:nums){
            currsum+=i;
            if(currsum>mid){
                subarraycount++;
                currsum=i;
            }
        }
        if(subarraycount<=k){
            return true;
        }
        return false;
    }
}