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
    public int kthSmallest(TreeNode root, int k) {
        List <Integer> arr=new ArrayList<>();
        Kth(root,arr);
       return arr.get(k-1);
    }

    void Kth(TreeNode node, List<Integer> arr){
        if(node==null){
            return;
        }
        Kth(node.left,arr);
        arr.add(node.val);
        Kth(node.right,arr);
    }
}
