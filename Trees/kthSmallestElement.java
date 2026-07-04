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

    int res ;
    int count;

    public void traversal(TreeNode curr){

        if(curr == null) return;

        if(curr.left != null) traversal(curr.left);
        count--;
        if(count == 0){
            res = curr.val;
            return;
        }
        if(curr.right != null) traversal(curr.right);

    }

    public int kthSmallest(TreeNode root, int k) {

        count = k;
        traversal(root);
        return res;
    }
}