class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int minlen=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
          sum+=nums[i];
          while(sum>=target){
            minlen=Math.min(minlen,i-l+1);
            sum-=nums[l];
            l++;
          }
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}