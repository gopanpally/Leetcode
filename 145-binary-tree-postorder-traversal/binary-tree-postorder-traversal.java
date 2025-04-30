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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> al1 = new ArrayList<>();
        if(root!=null)
        {
            al1.addAll(postorderTraversal(root.left));
            al1.addAll(postorderTraversal(root.right));
            al1.add(root.val);
        }
        return al1;
    }
}