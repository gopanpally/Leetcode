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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> al1 = new ArrayList<>();
        if(root==null){return al1;}

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        while(current!=null || !stack.isEmpty())
        {
            while(current!=null)
            {
                stack.push(current);
                current= current.left;
            }
            current= stack.pop();
            al1.add(current.val);

            current = current.right;

        }
        return al1;
    }
}