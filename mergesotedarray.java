import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int[] nums1=new int[m+n];
    int[] nums2=new int[n];
    System.out.println("First:\n");
    for(int i=0;i<m;i++){
      nums1[i]=sc.nextInt();
    }
    System.out.println("Second:\n");
    for(int i=0;i<n;i++){
      nums2[i]=sc.nextInt();
    }
    int i=m-1;
    int j=n-1;
    int k=m+n-1;
    while(j>=0){
      if(i>=0 && nums1[i]>nums2[j]){
        nums1[k--]=nums1[i--];
      }
      else{
        nums1[k--]=nums2[j--];
      }
    }
    System.out.println(Arrays.toString(nums1));
  }
}
    
