class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer>m=new HashMap<>();
        int maxlen=Integer.MIN_VALUE;
        int l=0;
        for(int i=0;i<fruits.length;i++){
            m.put(fruits[i],m.getOrDefault(fruits[i],0)+1);
            while(m.size()>2){
                  m.put(fruits[l],m.get(fruits[l])-1);
                  if(m.get(fruits[l])==0){
                    m.remove(fruits[l]);
                  }
                   l++;
            }
            maxlen=Math.max(maxlen,i-l+1);
           
        }
        return maxlen;
    }
}