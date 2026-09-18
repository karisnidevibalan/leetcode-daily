class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer>s=new ArrayDeque<>();
        int maxarea=0;
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[i]<heights[s.peek()]){
                int h=heights[s.pop()];
                int w;
                if(s.isEmpty()){
                    w=i;
                }
                else{
                    w=i-s.peek()-1;
                }
                int area=h*w;
                maxarea=Math.max(maxarea,area);
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            int h=heights[s.pop()];
            int w;
            if(s.isEmpty()){
                w=heights.length;
            }
            else{
                w=heights.length-s.peek()-1;
            }
            int a=h*w;
            maxarea=Math.max(maxarea,a);
        }
        return maxarea;
    }
}