/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxgain(root);
        return maxsum;
    }
    private int maxgain(TreeNode root){
if(root==null){
            return 0;
        }
        int leftgain=Math.max(0,maxgain(root.left));
        int rightgain=Math.max(0,maxgain(root.right));
        int  curr= root.val+leftgain+rightgain;
        maxsum=Math.max(maxsum,curr);
        return root.val+Math.max(leftgain,rightgain);
    }
}