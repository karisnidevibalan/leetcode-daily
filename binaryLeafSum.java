import java.util.*;
class TreeNode{
  int val;
  TreeNode left;
  TreeNode right;
TreeNode(){}
  TreeNode(int val){
    this.val=val;
  }
}
class Main{
  public static TreeNode buildTree(int[] arr,int i){
    if(i>=arr.length || arr[i]==-1){
      return null;
    }
    TreeNode root=new TreeNode(arr[i]);
    root.left=buildTree(arr,i*2+1);
    root.right=buildTree(arr,i*2+2);
    return root;
  }
  public static int sum1(TreeNode root){
    return dfs(root,0);
  }
  private static int dfs(TreeNode root, int sum){
    if(root==null){
      return 0;
    }
    sum=sum*2+root.val;
    if(root.left==null  && root.right==null){
      return sum;
    }
    return dfs(root.left,sum)+dfs(root.right,sum);
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    TreeNode root=buildTree(arr,0);
    System.out.println(sum1(root));
  }
}

// *2 shift the value in left so that we can add digits at the end.
