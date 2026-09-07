class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findbound(nums,target,true),findbound(nums,target,false)};
    }
    public int findbound(int[] nums,int target, boolean isFirst){
        int l=0;
        int r=nums.length-1;
        int bound=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                   bound=mid;
                   if(isFirst){
                    r=mid-1;
                   }
                   else{
                    l=mid+1;
                   }
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return bound;
    }
}