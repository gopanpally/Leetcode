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
        if(root==null){return al1;}
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty())
        {
            TreeNode current = stack1.pop();
            stack2.push(current);
            if(current.left!=null)
            {
                stack1.push(current.left);
            }
            if(current.right!=null)
            {
                stack1.push(current.right);
            }

        } 
         while(!stack2.isEmpty())
            {
                al1.add(stack2.pop().val);
            }  
        return al1;
    }
}