class Solution {
    public int pivotIndex(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int ls=0;
        int rs=0;
        left[0]=0;
        right[nums.length-1]=0;
        for(int i=1;i<nums.length;i++){
           ls+=nums[i-1];
           left[i]=ls;
        }
        for(int i=nums.length-2;i>=0;i--){
            rs+=nums[i+1];
            right[i]=rs;
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        for(int i=0;i<nums.length;i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        
        return -1;
    }
}