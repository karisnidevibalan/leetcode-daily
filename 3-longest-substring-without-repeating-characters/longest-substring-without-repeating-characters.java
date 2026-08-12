class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        if(s.length()==0 || s==null){
            return 0;
        }
        int len=0;
        int maxlen=Integer.MIN_VALUE;
        Set<Character>set=new HashSet<>();
        int r=0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
               l++;
            }
            set.add(s.charAt(i));
            maxlen=Math.max(maxlen,i-l+1);
              }
        
        return maxlen;
    }
}