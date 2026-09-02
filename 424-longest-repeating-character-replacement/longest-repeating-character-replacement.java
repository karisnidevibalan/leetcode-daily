class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer>m=new HashMap<>();
        int l=0;
        int maxlen=Integer.MIN_VALUE;
        int maxcount=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
                m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
                maxcount=Math.max(maxcount,m.get(s.charAt(i)));
                if(i-l+1-maxcount>k){
                    m.put(s.charAt(l),m.get(s.charAt(l))-1);
                    l++;

                }
                maxlen=Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}