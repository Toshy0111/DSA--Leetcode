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

   public String serialize(TreeNode root) {

    StringBuilder sb = new StringBuilder();
    serializeHelper(root, sb);
    return sb.toString();
   }
   
   public void serializeHelper(TreeNode curr, StringBuilder sb) {
    if (curr == null)  {
        sb.append("-#");
        return;
    }
    sb.append("-").append(curr.val);
    serializeHelper(curr.left, sb);
    serializeHelper(curr.right, sb);
   }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        String hashRoot = serialize(root);
        String hashSubroot = serialize(subRoot);

        return hashRoot.contains(hashSubroot);
    }
}