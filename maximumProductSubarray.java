import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int max=arr[0];
    int min=arr[0];
    int res=arr[0];
    for(int i=1;i<n;i++){
      int temp=max;
      max=Math.max(arr[i],Math.max(arr[i]*max,arr[i]*min));
        min=Math.min(arr[i],Math.min(arr[i]*temp,arr[i]*min));
        res=Math.max(res,max);
    }
    System.out.println(res);
  }
}
      
      
    
