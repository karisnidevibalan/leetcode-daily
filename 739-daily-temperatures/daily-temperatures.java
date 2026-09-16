class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer>s=new ArrayDeque<>();
        int[] arr=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int prev=s.pop();
                arr[prev]=i-prev;
            }
            s.push(i);
        }
        return arr;
    }
}