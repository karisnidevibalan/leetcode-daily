import java.util.*;


public class LeftLeaveSum {
    public static TreeNode buildTree(int[] arr,int i){
        if(i>=arr.length || arr[i]==-1){
            return null;
        }
        TreeNode root=new TreeNode(arr[i]);
        root.left=buildTree(arr,2*i+1);
        root.right=buildTree(arr,2*i+2);
        return root;
    }
    public static int sum1(TreeNode root){
        return dfs(root);
    }
    private static int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int sum=0;
        if(root.left!=null && root.left.left==null && root.left.right==null){
            sum+=root.left.val;
        }
        sum+=dfs(root.left);
        sum+=dfs(root.right);
        return sum;
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
