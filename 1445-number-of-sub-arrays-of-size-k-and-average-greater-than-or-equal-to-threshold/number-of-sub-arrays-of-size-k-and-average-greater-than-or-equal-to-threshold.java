class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0;
        int sum=0;
        int c=0;
        int avg;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             sum+=arr[i];
             if(i>=(k-1)){
                    // maxsum=Math.max(maxsum,sum); 
                    avg=sum / k;
                    if(avg>=threshold){
                        c++;
                    }
                    sum-=arr[l];
                    l++;
             }
        }
        return c;
    }
}