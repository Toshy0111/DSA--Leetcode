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
     
     public void traversal(TreeNode curr, int level, List<List<Integer>> ans){
        if(curr == null) return;
        if(ans.size() == level)
        {
           ans.add(new ArrayList<>());
        }

        if (level % 2 == 0) {
            ans.get(level).add(curr.val);
        } else {
            ans.get(level).add(0, curr.val);
        }

        
            traversal(curr.left, level+1, ans);
            traversal(curr.right, level+1, ans);

       
     }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        traversal(root, 0, res);
        return res;
        
    }
}