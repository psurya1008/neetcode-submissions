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
    public int checkNode(TreeNode root, int max){
        if(root==null){
            return 0;
        }
        if(root.val>=max){
            int max2=root.val;
            return 1+checkNode(root.left,max2)+checkNode(root.right,max2);
        }

        return checkNode(root.left,max)+checkNode(root.right,max);
    }
    public int goodNodes(TreeNode root) {
        return checkNode(root,root.val);
    }
}
