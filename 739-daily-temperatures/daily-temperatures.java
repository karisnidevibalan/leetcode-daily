class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer>s=new ArrayDeque<>();
        Map<Integer,Integer>m=new HashMap<>();
        int[] arr=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                m.put(s.pop(),i);
            }
            s.push(i);
        }
        for(int i=0;i<temperatures.length;i++){
            if(m.containsKey(i)){
            arr[i]=(m.get(i))-i;
        }
        else{
            arr[i]=0;
        }
        }
        return arr;
    }
}