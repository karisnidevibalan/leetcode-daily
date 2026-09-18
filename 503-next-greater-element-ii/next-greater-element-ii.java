class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] arr=new int[nums.length];
        Arrays.fill(arr,-1);
        Deque<Integer>s=new ArrayDeque<>();
        for(int i=n*2-1;i>=0;i--){
            int currind=i%n;
            while(!s.isEmpty() && nums[currind]>=nums[s.peek()]){
                s.pop();
            }
            if(i<n && !s.isEmpty()){
              arr[currind]= nums[s.peek()];       
            }
            s.push(currind);
        }
        return arr;
    }
}