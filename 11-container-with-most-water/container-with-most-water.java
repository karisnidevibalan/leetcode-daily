class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int prod=1;
        int ind;
        int width=Integer.MAX_VALUE;
        int maxprod=Integer.MIN_VALUE;
 int maxsum=Integer.MIN_VALUE;
        while(l<r){
            ind=r-l;
            width=Math.min(height[l],height[r]);
          prod=width*ind;
         maxprod=Math.max(maxprod,prod);
         if(height[l]<height[r]){
            l++;
         }
         else{
            r--;
         }
        }
        return maxprod;
    }
}