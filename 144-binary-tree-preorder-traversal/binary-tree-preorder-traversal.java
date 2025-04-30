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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> al1 = new ArrayList<>();
        if(root!=null)
        {
            al1.add(root.val);
            al1.addAll(preorderTraversal(root.left));
            al1.addAll(preorderTraversal(root.right));

        }
        return al1;
    }
}