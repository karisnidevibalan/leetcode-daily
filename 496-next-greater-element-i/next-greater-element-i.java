class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer>s=new ArrayDeque<>();
        Map<Integer,Integer>m=new HashMap<>();
        int[] arr=new int[nums1.length];
        for(int num:nums2){
            while(!s.isEmpty() && s.peek()<num){
                m.put(s.pop(),num);
            }
            s.push(num);
        }
      
        for(int i=0;i<nums1.length;i++){
            arr[i]=m.getOrDefault(nums1[i],-1);
        }
        return arr;
    }
}